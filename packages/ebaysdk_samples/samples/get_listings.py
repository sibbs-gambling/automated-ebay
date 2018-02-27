## IMPORTS MODULES AND HOUSEKEEPING #############################################################
import ebaysdk
import time
from ebaysdk.finding import Connection as finding
from ebaysdk.finding import Connection as tag
from ebaysdk.finding import Connection as nodeText
from optparse import OptionParser
print('----------------------------------------------------------------', str(time.asctime(time.localtime(time.time()))))

## DEFINES INITIAL OPTIONS FOR THE CALL TO API ##################################################
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

## MAKES API CALL ################################################################################
f = finding(debug=opts.debug, appid=opts.appid, config_file=opts.yaml, warnings=True,  descriptionSearch=True)
api_request = {'keywords': u'ipod nano','itemFilter': [{'name': 'Condition','value': 'Used'},{'name': 'LocatedIn','value': 'GB'},],'affiliate': {'trackingId': 1},'sortOrder': 'CountryDescending',}

response = f.execute('findItemsAdvanced', api_request)    

print(response)

dom    = f.response_dom()
mydict = f.response_dict()

print(mydict)

# shortcut to response data

#print f.v('itemSearchURL')

# process the response via DOM
#items = dom.getElementsByTagName('item')
#for item in items:
  #i_name=item.getElementsByTagName('title')[0]
  #print nodeText(i_name)
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  <item>
  <itemId>351375163034</itemId>
  <title>10 Pennsylvania Phoenixville, Perkasie, Penargyle, Prompton +more DUPLEX CANCELS</title>
  <globalId>EBAY-US</globalId>
  <primaryCategory>
  	<categoryId>689</categoryId>
  	<categoryName>Postal History</categoryName>
  </primaryCategory>
  <galleryURL>http://thumbs3.ebaystatic.com/m/mwAsISr7jmMKEV-S2Z3Y5gQ/140.jpg</galleryURL>
  <viewItemURL>http://www.ebay.com/itm/10-Pennsylvania-Phoenixville-Perkasie-Penargyle-Prompton-more-DUPLEX-CANCELS-/351375163034?pt=LH_DefaultDomain_0</viewItemURL>
  <paymentMethod>PayPal</paymentMethod>
  <autoPay>false</autoPay>
  <postalCode>80107</postalCode>
  <location>Elizabeth,CO,USA</location>
  <country>US</country>
  <shippingInfo>
  	<shippingType>Calculated</shippingType>
  	<shipToLocations>US</shipToLocations>
  	<expeditedShipping>false</expeditedShipping>
  	<oneDayShippingAvailable>false</oneDayShippingAvailable>
  	<handlingTime>1</handlingTime>
  </shippingInfo>
  <sellingStatus>
  	<currentPrice currencyId="USD">16.75</currentPrice>
  	<convertedCurrentPrice currencyId="USD">16.75</convertedCurrentPrice>
  	<bidCount>0</bidCount>
  	<sellingState>Active</sellingState>
  	<timeLeft>P0DT15H26M25S</timeLeft>
  </sellingStatus>
  <listingInfo>
  	<bestOfferEnabled>false</bestOfferEnabled>
  	<buyItNowAvailable>false</buyItNowAvailable>
  	<startTime>2015-04-17T16:20:53.000Z</startTime>
  	<endTime>2015-04-24T16:20:53.000Z</endTime>
  	<listingType>Auction</listingType>
  	<gift>false</gift>
  </listingInfo>
  <returnsAccepted>true</returnsAccepted>
  <isMultiVariationListing>false</isMultiVariationListing>
  <topRatedListing>false</topRatedListing>
  </item>
  
  