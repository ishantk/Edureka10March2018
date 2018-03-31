package co.edureka.parsers;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMReader {

	public static void main(String[] args) {
		try {
			
			// Source
			File file = new File("/Users/ishantkumar/Downloads/edurekaStudents.xml");
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file);
			
			String rootElm = document.getDocumentElement().getNodeName();
			System.out.println("Root Element is: "+rootElm);
			
			NodeList nodeList = document.getElementsByTagName(Util.TAG_STUDENT);
			System.out.println(nodeList.getLength()+" student tags found");
			
			// 3 times
			for(int i=0;i<nodeList.getLength();i++){
				Node node = nodeList.item(i);
				//System.out.println("Node Name: "+node.getNodeName());
				
				if(node.getNodeType() == Node.ELEMENT_NODE){
					Element elm = (Element)node;
					String roll = elm.getElementsByTagName(Util.TAG_ROLL).item(0).getTextContent();
					String name = elm.getElementsByTagName(Util.TAG_NAME).item(0).getTextContent();
					String age = elm.getElementsByTagName(Util.TAG_AGE).item(0).getTextContent();
					System.out.println(roll+" - "+name+" - "+age);
				}
				
				System.out.println("--------------------------------");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}

	}

}
