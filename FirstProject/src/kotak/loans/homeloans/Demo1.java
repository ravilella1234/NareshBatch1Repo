package kotak.loans.homeloans;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Demo1 
{

	public static void main(String[] args) throws Exception 
	{
		File fXmlFile = new File("C:\\Users\\DELL\\Desktop\\employee.xml");
	    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	    Document doc = dBuilder.parse(fXmlFile);
	    //doc.getDocumentElement().normalize();

	    String root = doc.getDocumentElement().getTagName();
	    System.out.println("Root element :" + root);
	    NodeList nodeList = doc.getElementsByTagName("employee");
	    System.out.println(nodeList.getLength());
	    
	    for(int i=0;i<nodeList.getLength();i++)
		{
			Node node = nodeList.item(i);
			System.out.println("\n Current Element :" + node.getNodeName());
			if (node.getNodeType() == Node.ELEMENT_NODE)
			{
				Element eElement = (Element)node;
				
				System.out.println("id : "
                        + eElement.getElementsByTagName("id")
                        .item(0).getTextContent());
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
