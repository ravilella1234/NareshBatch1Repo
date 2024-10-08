package kotak.loans.homeloans;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Demo 
{

	public static void main(String[] args) throws Exception 
	{
		File fXmlFile = new File("C:\\Users\\DELL\\Desktop\\employee.xml");
	    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	    Document doc = dBuilder.parse(fXmlFile);
	    //doc.getDocumentElement().normalize();

	    System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	    NodeList nList = doc.getElementsByTagName("employee");
	    System.out.println("----------------------------");

	    for (int temp = 0; temp < nList.getLength(); temp++) 
	    {
	        Node nNode = nList.item(temp);
	        System.out.println("\nCurrent Element :" + nNode.getNodeName());
	        if (nNode.getNodeType() == Node.ELEMENT_NODE) 
	        {
	            Element eElement = (Element) nNode;
	            System.out.println("id : "
	                               + eElement.getAttribute("id"));
	            System.out.println("name : "
	                               + eElement.getElementsByTagName("name")
	                                 .item(0).getTextContent());
	            System.out.println("position : "
	                               + eElement.getElementsByTagName("position")
	                                 .item(0).getTextContent());
	            System.out.println("joinyear : "
	                               + eElement.getElementsByTagName("joinyear")
	                                 .item(0).getTextContent());
	            System.out.println("Salary : "
	                               + eElement.getElementsByTagName("salary")
	                                 .item(0).getTextContent());
	        }
	    }
	}
}
