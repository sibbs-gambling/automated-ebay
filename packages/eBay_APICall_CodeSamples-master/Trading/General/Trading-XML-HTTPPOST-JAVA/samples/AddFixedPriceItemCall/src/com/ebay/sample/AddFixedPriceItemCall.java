/* 
 * � 2010-2013 eBay Inc., All Rights Reserved 
 * Licensed under CDDL 1.0 -  http://opensource.org/licenses/cddl1.php
 */

package com.ebay.sample;

import ebay.apis.eblbasecomponents.*;
import java.io.*;
import java.net.URL;
import java.util.*;
import javax.xml.bind.*;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author zhuyang@ebay.com
 */
public class AddFixedPriceItemCall {

    private static String JAXB_PACKAGE_NAME = "ebay.apis.eblbasecomponents";
    private String USERTOKEN;
    private String SERVERURL;
    private static JAXBContext jc;
    private Properties prop;


    public AddFixedPriceItemCall() {
        prop = new Properties();
        try {
            String path = (new java.io.File(".").getCanonicalPath());
            String CONFIG_PROPERTIES = path + System.getProperty("file.separator") + "configuration.xml";
            if (CONFIG_PROPERTIES == null && CONFIG_PROPERTIES.length() == 0) {
                System.err.println(" the configuration.xml roperties file is not found.");
                System.exit(0);
            }
            prop.loadFromXML(new FileInputStream(CONFIG_PROPERTIES));
            SERVERURL = prop.getProperty("serverURL");
            USERTOKEN = prop.getProperty("userToken");
            System.out.println("API Server URL: "+SERVERURL );
        } catch (IOException ioe) {
            //handle exception
        }
    }

    public static void main(String[] args) {
        AddFixedPriceItemCall sample = new AddFixedPriceItemCall();

        XMLRequesterCredentialsType requestCredential = new XMLRequesterCredentialsType();
        requestCredential.setEBayAuthToken(sample.USERTOKEN);
        try {
            // create and initial an AddFixedPriceItemRequestType object
            AddFixedPriceItemRequestType requestObj = new AddFixedPriceItemRequestType();
            requestObj.setWarningLevel(WarningLevelCodeType.HIGH);
            requestObj.setRequesterCredentials(requestCredential);
            requestObj.setErrorLanguage("en_US");
            //build an item object
            ItemType item = sample.createItem();
            requestObj.setItem(item);
            // marshal the AddFixedPriceItemRequestType object to the XML document
            String requestXML = sample.marshalObject2Xml(requestObj);
            // open SSL HTTPS connect and send request
            InputStreamReader inputStream = sample.openConnectionFireRequest(requestXML, "AddFixedPriceItem");
            // unmarshal response stream into a Java content tree
            Object returnedObj = sample.unmarshalInputStream(inputStream);
            if (returnedObj != null && returnedObj instanceof AddFixedPriceItemResponseType) {
                AddFixedPriceItemResponseType response = (AddFixedPriceItemResponseType) returnedObj;

                System.out.println(response.getAck());
                System.out.println(response.getBuild());
                System.out.println(response.getItemID());
            }
        } catch (Exception e) {
            //handle exception
        }
    }

    /*
     *  marshal AddFixedPriceItemRequestType object to XML data  file
     *
     */
    private String marshalObject2Xml(AddFixedPriceItemRequestType requestobj) throws Exception {
        String requestXmlFileName = "AddFixedPriceItemRequest.xml";
        jc = JAXBContext.newInstance(JAXB_PACKAGE_NAME);
        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        ObjectFactory of = new ObjectFactory();

        JAXBElement<AddFixedPriceItemRequestType> requestElement = of.createAddFixedPriceItemRequest(requestobj);
        m.marshal(requestElement, new FileWriter(requestXmlFileName));
        return requestXmlFileName;
    }

    /*
     * open SSL https connection and send the request xml data
     *
     */
    public InputStreamReader openConnectionFireRequest(String XmlFileName, String APICallName) throws Exception {
        URL url = new URL(SERVERURL);
        // open SSL https connection
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setRequestMethod("POST");

        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "text/xml");
        // required headers
        conn.setRequestProperty("X-EBAY-API-COMPATIBILITY-LEVEL", "825");
        conn.setRequestProperty("X-EBAY-API-CALL-NAME", APICallName);
        conn.setRequestProperty("X-EBAY-API-SITEID", "0");

        PrintWriter output = new PrintWriter(new OutputStreamWriter(conn.getOutputStream()));
        Thread.sleep(11000);
        String fileContent = convertFileContent2String(XmlFileName);

        System.out.println(conn.getURL());
        System.out.println(fileContent);
        output.println(fileContent);
        output.close();
        conn.connect();
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        return isr;
    }

    /*
     * read input stream and unmarshal it into a Java content tree
     */
    public Object unmarshalInputStream(InputStreamReader isr) {
        Object returnedObj = null;
        try {
            int c = 0;
            String addFixedPriceItemResponse = "AddFixedPriceItemResponse.xml";
            OutputStream f = new FileOutputStream(addFixedPriceItemResponse);
            while ((c = isr.read()) > -1) {
                f.write(c);
            }
            f.close();
            String responseXML = convertFileContent2String(addFixedPriceItemResponse);
            System.out.println(responseXML);
            InputStream input = new ByteArrayInputStream(responseXML.getBytes());
            JAXBContext context = JAXBContext.newInstance(JAXB_PACKAGE_NAME);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            JAXBElement<Object> poe = (JAXBElement) unmarshaller.unmarshal(input);//(new
            returnedObj = poe.getValue();

            isr.close();
        } catch (Exception e) {
            //handle exception
        }
        return returnedObj;
    }

    public ItemType createItem() throws Exception {
        ItemType item = new ItemType();
        item.setSite(SiteCodeType.US);
        item.setCurrency(CurrencyCodeType.USD);
        item.setListingType(ListingTypeCodeType.FIXED_PRICE_ITEM);
        item.setTitle("Test. DO NOT BID");
        item.setDescription("This is a test item.");
        AmountType at = new AmountType();
        at.setValue(1.01);
        item.setStartPrice(at);
        item.setListingDuration(ListingDurationCodeType.DAYS_3.value());
        item.setLocation("San Jose, CA");
        item.setCountry(CountryCodeType.US);

        BestOfferDetailsType bo = new BestOfferDetailsType();
        bo.setBestOfferEnabled(new Boolean(false));
        item.setBestOfferDetails(bo);

        CategoryType cat = new CategoryType();
        cat.setCategoryID("14111");
        item.setPrimaryCategory(cat);

        item.setQuantity(new Integer(1));

        // Payment

        List<BuyerPaymentMethodCodeType> paymentMethods = new ArrayList<BuyerPaymentMethodCodeType>();
        paymentMethods.add(BuyerPaymentMethodCodeType.PAY_PAL);
        item.getPaymentMethods().addAll(paymentMethods);
        item.setPayPalEmailAddress("me@ebay.com");
        //
        item.setShippingDetails(createShippingDetails());

        //fill in mandatory fields
        item.setDispatchTimeMax(Integer.valueOf(1));
        ReturnPolicyType returnPolicy = new ReturnPolicyType();
        returnPolicy.setReturnsAcceptedOption("ReturnsAccepted");
        item.setReturnPolicy(returnPolicy);

        item.setSKU("1122334455-01");

        // uncomment this out for adding an image to the listing
        //
        /*
        String IMAGEURL = "YOUR IMAGE URL";
        PictureDetailsType pictureDetails = new PictureDetailsType();
        String pictureUrl = IMAGEURL;
        List<String> pictureUrls = new ArrayList<String>();
        pictureUrls.add(pictureUrl);
        pictureDetails.getPictureURL().addAll(pictureUrls);
        pictureDetails.setGalleryURL(pictureUrl);
        pictureDetails.setGalleryType(GalleryTypeCodeType.GALLERY);
        item.setPictureDetails(pictureDetails);
        */

        return item;
    }

    static ShippingDetailsType createShippingDetails() throws Exception {
        // Shipping details.
        ShippingDetailsType sd = new ShippingDetailsType();
        SalesTaxType salesTax = new SalesTaxType();
        salesTax.setSalesTaxPercent(new Float(0.0825));
        salesTax.setSalesTaxState("CA");
        sd.setSalesTax(salesTax);
        sd.setApplyShippingDiscount(new Boolean(true));

        AmountType at = new AmountType();
        sd.setPaymentInstructions("eBay test instruction.");
        sd.setShippingType(ShippingTypeCodeType.FLAT);

        //
        ShippingServiceOptionsType st1 = new ShippingServiceOptionsType();

        st1.setShippingService("USPSExpressMail");
        at = new AmountType();
        at.setValue(1.0);
        st1.setShippingServiceAdditionalCost(at);
        at = new AmountType();
        at.setValue(1);
        st1.setShippingServiceCost(at);
        st1.setShippingServicePriority(new Integer(1));
        at = new AmountType();
        at.setValue(1.0);

        List<ShippingServiceOptionsType> shippingServiceList = new ArrayList<ShippingServiceOptionsType>();
        shippingServiceList.add(st1);
        sd.getShippingServiceOptions().addAll(shippingServiceList);

        return sd;
    }

    private static String convertFileContent2String(String fileName) {
        String fileContentInString = "";
        try {
            File soapFile = new File(fileName);
            byte fileContent[] = new byte[(int) soapFile.length()];
            FileInputStream soapFileIS = new FileInputStream(soapFile);
            soapFileIS.read(fileContent, 0, fileContent.length);
            fileContentInString = new String(fileContent);
        } catch (Exception ex) {
            //handle exception
        }

        return fileContentInString;
    }
}