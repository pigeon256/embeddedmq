package com.example.demo;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.junit.jupiter.api.Test;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXMLTest {
  @Test
  public void readXml() throws Exception {
    try {

      SAXParserFactory factory = SAXParserFactory.newInstance();
      SAXParser saxParser = factory.newSAXParser();

      DefaultHandler handler =
          new DefaultHandler() {

            boolean bfname = false;

            public void startElement(
                String uri, String localName, String qName, Attributes attributes)
                throws SAXException {

              System.out.println("Start Element :" + qName);

              if (qName.equalsIgnoreCase("Id")) {
                bfname = true;
              }
            }

            public void endElement(String uri, String localName, String qName) throws SAXException {

              System.out.println("End Element :" + qName);
            }

            public void characters(char ch[], int start, int length) throws SAXException {

              if (bfname) {
                System.out.println("First Name : " + new String(ch, start, length));
                bfname = false;
              }

            }
          };

      saxParser.parse("src/test/resources/Outbound_NRRep_XML.xml", handler);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
