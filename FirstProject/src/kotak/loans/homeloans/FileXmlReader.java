package kotak.loans.homeloans;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class FileXmlReader 
{

	public static void main(String[] args) throws Exception 
	{
		// DocumentBuilderFactory
		// DocumentBuilder
		// Document
		
		File f = new File("C:\\Users\\DELL\\Desktop\\employee.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.parse(f);
		
		Element root = document.getDocumentElement();
		//NodeList nodelist = root.getChildNodes();
		NodeList nodelist = document.getElementsByTagName("employee");
		System.out.println(nodelist.getLength());
		
		for(int i=0;i<nodelist.getLength();i++)
		{
			Node node = nodelist.item(i);
			
			
			Element element = null;
			if(node.getNodeType() == Node.ELEMENT_NODE)
			{
				element  = (Element)node;
				String tagName = element.getElementsByTagName("id").item(i).getTextContent();
				String tagValue = element.getTextContent();
				System.out.println(tagName+"----"+ tagValue);
			}
				
			
		}
		
	}

}
