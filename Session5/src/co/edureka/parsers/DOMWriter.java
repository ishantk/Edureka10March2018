package co.edureka.parsers;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class DOMWriter {

	public static void main(String[] args) {
		
		try{
		
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();
	
			// Constructing Tags for XML File
			Element rootElm = document.createElement("students");
			Element stuElm = document.createElement("student");
			Element rollElm = document.createElement("roll");
			Element nameElm = document.createElement("name");
			Element ageElm = document.createElement("age");
			
			// Data for Tags
			Text txtRoll = document.createTextNode("101");
			Text txtName = document.createTextNode("John Watson");
			Text txtAge = document.createTextNode("19");
			
//			Text txtRoll2 = document.createTextNode("102");
//			Text txtName2 = document.createTextNode("Jennie Watson");
//			Text txtAge2 = document.createTextNode("21");
			
			// Append the data in Tags
			rollElm.appendChild(txtRoll);
			nameElm.appendChild(txtName);
			ageElm.appendChild(txtAge);
			
			stuElm.appendChild(rollElm);
			stuElm.appendChild(nameElm);
			stuElm.appendChild(ageElm);
			
			rootElm.appendChild(stuElm);
			
			document.appendChild(rootElm);
			
			TransformerFactory tFactroy = TransformerFactory.newInstance();
			Transformer transformer = tFactroy.newTransformer();
			
			DOMSource source = new DOMSource(rootElm); // source
			
			// destination
			File file = new File("/Users/ishantkumar/Downloads/edurekaStudents.xml");
			FileOutputStream fos = new FileOutputStream(file);
			StreamResult result = new StreamResult(fos);
			
			transformer.transform(source, result);
			System.out.println("XML File Generated...");
		}catch(Exception e){
			System.out.println("Some Exception "+e);
		}
	}

}
