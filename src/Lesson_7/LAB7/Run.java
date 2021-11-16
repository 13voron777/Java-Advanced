package Lesson_7.LAB7;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Run {
    public static void main(String[] args) {
        try {
            File xml = new File("src\\Lesson_7\\LAB7\\menu.xml");
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = documentBuilder.parse(xml);
            Element root = doc.getDocumentElement();
            System.out.println("Root element: " + root.getNodeName());
            System.out.println("----------------------");

            NodeList nl = root.getChildNodes();
            for (int i = 0; i < nl.getLength(); i++) {
                Node node = nl.item(i);
                if (node.getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                Element element = (Element) node;
                System.out.println("Food:");
                System.out.println("Name: " + element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue());
                System.out.println("Price: " + element.getElementsByTagName("price").item(0).getChildNodes().item(0).getNodeValue());
                System.out.println("Description: " + element.getElementsByTagName("description").item(0).getChildNodes().item(0).getNodeValue());
                System.out.println("Calories: " + element.getElementsByTagName("calories").item(0).getChildNodes().item(0).getNodeValue());
                System.out.println("----------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
