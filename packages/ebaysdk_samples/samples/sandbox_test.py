### Program creates dataset of all listings for a given keyword
from ebaysdk.finding import Connection as Finding
from ebaysdk.shopping import Connection as Shopping
from optparse import OptionParser
from lxml import etree
import csv
import os

## Defines initial options for use in API
def init_options():
    usage = "usage: %prog [options]"
    parser = OptionParser(usage=usage)
    parser.add_option("-d", "--debug",
                      action="store_true", dest="debug", default=False,
                      help="Enabled debugging [default: %default]")
    parser.add_option("-y", "--yaml",
                      dest="yaml", default='ebay.yaml',
                      help="Specifies the name of the YAML defaults file. [default: %default]")
    parser.add_option("-a", "--appid",
                      dest="appid", default=None,
                      help="Specifies the eBay application id to use.")
    (opts, args) = parser.parse_args()
    return opts, args

(opts, args) = init_options()

## Defines api using finditemsadvanced
api = Finding(appid=opts.appid)

## Defines parser for xml and creates root object of xml string
parser = etree.XMLParser(recover=True, remove_blank_text=True)
def bareTag(tag):  #removes tag URL string
    lst = tag.split('}')
    return lst[-1]
namespace='{http://www.ebay.com/marketplace/search/v1/services}'
header = []   # init -- future column names
d = {}        # init -- values of the elements
item_ids=[]

## Creates csv for listing specific info
f_fname_tmp = 'f_temporary.csv'
with open(f_fname_tmp, 'wb') as fout:
    writer = csv.writer(fout)
    f_api = Finding(appid=opts.appid)
    s_api = Shopping(appid=opts.appid)
    for i in range(1):
        i=i+1
        response=f_api.execute('findItemsAdvanced', {'keywords': 'macbook pro',
        'itemFilter': [
        {'name':  'ListingType', 'value':'AuctionWithBIN'}],
        'paginationInput': {'entriesPerPage': '100','pageNumber': str(i)},})
        xml=response.content
        root = etree.fromstring(xml)
        assert bareTag(root.tag) == 'findItemsAdvancedResponse'
        items = root.findall(namespace+'searchResult/'+namespace+'item')
        items = list(set(items))
        for item in items:
            for e in item:
                if bareTag(e.tag) == 'primaryCategory':
                    for nested_e in e:
                        # Add the prefix for the dictionary key.
                        k =bareTag(nested_e.tag)
                        v =nested_e.text
                        # Add to the dictionary.
                        d[k] = v
                        # If not in header, append it.
                        if k not in header:
                            header.append(k)    
                elif bareTag(e.tag) == 'shippingInfo':
                    for nested_e in e:
                        # Add the prefix for the dictionary key.
                        k =bareTag(nested_e.tag)
                        v =nested_e.text
                        # Add to the dictionary.
                        d[k] = v
                        # If not in header, append it.
                elif bareTag(e.tag) == 'sellingStatus':
                    for nested_e in e:
                        # Add the prefix for the dictionary key.
                        k =bareTag(nested_e.tag)
                        v =nested_e.text
                        # Add to the dictionary.
                        d[k] = v
                        # If not in header, append it.
                        if k not in header:
                            header.append(k)      
                elif bareTag(e.tag) == 'listingInfo':
                    for nested_e in e:
                        # Add the prefix for the dictionary key.
                        k =bareTag(nested_e.tag)
                        v =nested_e.text
                        # Add to the dictionary.
                        d[k] = v
                        # If not in header, append it.
                        if k not in header:
                            header.append(k)      
                else:
                	# General information for the item.
                    k = bareTag(e.tag)
                    v = e.text
                	# Add to the dictionary.
                    d[k] = v
                    if k==str('itemId'):
                        item_ids+=[d.get(k, None)]
            	    # If not in header, append it.
                    if k not in header:
                        header.append(k)
            # Column name from header as a key, None as default value.
            # Replace newlines by spaces (or any better character 
            # for the purpose) and strip the value.
            #row = [d.get(k, None).encode('utf-8').strip() for k in header]
            row=[]
            for k in header:
                try:
                    row+=[d.get(k, None).encode('utf-8').strip()]
                except UnicodeEncodeError:
                    print([d.get(k, None)])
                    row+=[d.get(k, None).strip()]
                except AttributeError:
                    row+=["None"]
            writer.writerow(row)    
            
## Creates detailed item csv file
num_items=len(item_ids)
get_mult_lim=20
num_sets=num_items/get_mult_lim
s_namespace = '{urn:ebay:apis:eBLBaseComponents}'
s_fname_tmp = 's_temporary.csv'
with open(s_fname_tmp, 'wb') as fout:
    writer = csv.writer(fout)
    f_api = Finding(appid=opts.appid)
    s_api = Shopping(appid=opts.appid)
    for i in range(num_sets):
        i=i+1
        begin=(i*get_mult_lim)-20
        end=(i*get_mult_lim)
        item_set=item_ids[begin:end]
        #print(item_set)
        s_response=s_api.execute('GetMultipleItems',{'ItemID':item_set})
        xml=s_response.content
        print(xml)
        stop
        #print(xml)
        root = etree.fromstring(xml)
        assert bareTag(root.tag) == 'GetMultipleItemsResponse'
        items = root.findall(s_namespace+'Item')
        items = list(set(items))
        for item in items:
            print("-----------------------------")
            for e in sorted(item):
                print(bareTag(e.tag))
                if bareTag(e.tag) == 'BusinessSellerDetails':
                    for nested_e in e:
                        if bareTag(e.tag) == 'Address':
                            for nested_e in e:
                                # Add the prefix for the dictionary key.
                                k =bareTag(nested_e.tag)
                                v =nested_e.text
                                # Add to the dictionary.
                                d[k] = v
                                # If not in header, append it.
                                if k not in header:
                                    header.append(k) 
                        elif bareTag(e.tag) == 'VATDetails':
                            for nested_e in e:
                                # Add the prefix for the dictionary key.
                                k =bareTag(nested_e.tag)
                                v =nested_e.text
                                # Add to the dictionary.
                                d[k] = v
                                # If not in header, append it.
                                if k not in header:
                                    header.append(k) 
                    else:
                        # Add the prefix for the dictionary key.
                        k =bareTag(nested_e.tag)
                        v =nested_e.text
                        # Add to the dictionary.
                        d[k] = v
                        # If not in header, append it.
                        if k not in header:
                            header.append(k)    
                elif bareTag(e.tag) == 'Charity':
                    for nested_e in e:
                        # Add the prefix for the dictionary key.
                        k =bareTag(nested_e.tag)
                        v =nested_e.text
                        # Add to the dictionary.
                        d[k] = v
                        # If not in header, append it.
                elif bareTag(e.tag) == 'DiscountPriceInfo':
                    for nested_e in e:
                        # Add the prefix for the dictionary key.
                        k =bareTag(nested_e.tag)
                        v =nested_e.text
                        # Add to the dictionary.
                        d[k] = v
                        # If not in header, append it.
                elif bareTag(e.tag) == 'HighBidder':
                    for nested_e in e:
                        # Add the prefix for the dictionary key.
                        k =bareTag(nested_e.tag)
                        v =nested_e.text
                        # Add to the dictionary.
                        d[k] = v
                        # If not in header, append it.
                elif bareTag(e.tag) == 'ItemSpecifics':
                    for nested_e in e:
                        if bareTag(e.tag) == 'NameValueList':
                            for nested_e in e:
                                print(nested_e)
                                # Add the prefix for the dictionary key.
                                k =bareTag(nested_e.tag)
                                v =nested_e.text
                                # Add to the dictionary.
                                d[k] = v
                                # If not in header, append it.
                                if k not in header:
                                    header.append(k) 
                        else:
                            # Add the prefix for the dictionary key.
                            k =bareTag(nested_e.tag)
                            v =nested_e.text
                            # Add to the dictionary.
                            d[k] = v
                            # If not in header, append it.
                elif bareTag(e.tag) == 'ReturnPolicy':
                    for nested_e in e:
                        # Add the prefix for the dictionary key.
                        k =bareTag(nested_e.tag)
                        v =nested_e.text
                        # Add to the dictionary.
                        d[k] = v
                        # If not in header, append it.
                elif bareTag(e.tag) == 'Seller':
                    for nested_e in e:
                        # Add the prefix for the dictionary key.
                        k =bareTag(nested_e.tag)
                        v =nested_e.text
                        # Add to the dictionary.
                        d[k] = v
                        # If not in header, append it.
                elif bareTag(e.tag) == 'ShippingCostSummary':
                    for nested_e in e:
                        # Add the prefix for the dictionary key.
                        k =bareTag(nested_e.tag)
                        v =nested_e.text
                        # Add to the dictionary.
                        d[k] = v
                        # If not in header, append it
                elif bareTag(e.tag) == 'Storefront':
                    for nested_e in e:
                        # Add the prefix for the dictionary key.
                        k =bareTag(nested_e.tag)
                        v =nested_e.text
                        # Add to the dictionary.
                        d[k] = v
                        # If not in header, append it.
                elif bareTag(e.tag) == 'UnitInfo':
                    for nested_e in e:
                        # Add the prefix for the dictionary key.
                        k =bareTag(nested_e.tag)
                        v =nested_e.text
                        # Add to the dictionary.
                        d[k] = v
                        # If not in header, append it
                else:
               	    # General information for the item.
                    k = bareTag(e.tag)
                    v = e.text
            	    # Add to the dictionary.
                    d[k] = v
                    if k==str('itemId'):
                        item_ids+=[d.get(k, None)]
        	        # If not in header, append it.
                    if k not in header:
                        header.append(k)
                # Column name from header as a key, None as default value.
                # Replace newlines by spaces (or any better character 
                # for the purpose) and strip the value.
                #row = [d.get(k, None).encode('utf-8').strip() for k in header]
            row=[]
            for k in header:
                try:
                    row+=[d.get(k, None).encode('utf-8').strip()]
                except UnicodeEncodeError:
                    row+=[d.get(k, None).strip()]
                except AttributeError:
                    row+=["None"]
            writer.writerow(row)
               
# Now all records were collected. The header contains all column names.
# Generate the final CSV from the header and the temporary csv.
s_fname_final = 'item_details.csv'
f_fname_final = 'listing_specifics.csv'

with open(s_fname_tmp, 'rb') as fin, \
     open(s_fname_final, 'wb') as fout:
    reader =csv.reader(fin)
    writer =csv.writer(fout)

    # Write the header first.
    writer.writerow(header)

    # Copy the lines from the temporary.
    for row in reader:
        writer.writerow(row)
        
with open(f_fname_tmp, 'rb') as fin, \
     open(f_fname_final, 'wb') as fout:
    reader =csv.reader(fin)
    writer =csv.writer(fout)

    # Write the header first.
    writer.writerow(header)

    # Copy the lines from the temporary.
    for row in reader:
        writer.writerow(row)
        
os.remove('s_temporary.csv')
os.remove('f_temporary.csv')




