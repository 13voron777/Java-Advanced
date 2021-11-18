package Lesson_7.HW7.Task3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class Run {
    public static void main(String[] args) {
        final String fileName = "src\\Lesson_7\\HW7\\Task3\\cities.xml";
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler() {
                private String currentElement;

                @Override
                public void startDocument() throws SAXException {
                    System.out.println("Start cities.xml");
                }

                @Override
                public void endDocument() throws SAXException {
                    System.out.println("End cities.xml");
                }

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    if (attributes.getValue(0) != null) {
                        System.out.println("Start element " + qName + " " + attributes.getValue(0));
                    } else {
                        System.out.println("Start element " + qName);
                    }
                    currentElement = qName;
                }

                @Override
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    System.out.println("End element " + qName);
                    currentElement = null;
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    if (currentElement != null &&
                            (currentElement.equalsIgnoreCase("street")
                                    || currentElement.equalsIgnoreCase("house"))) {
                        System.out.println(currentElement + ": " + new String(ch, start, length));
                    }
                }
            };
            saxParser.parse(fileName, handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
