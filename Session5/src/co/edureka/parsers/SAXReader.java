package co.edureka.parsers;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class SAXHandler extends DefaultHandler{
	
	public void startDocument() throws SAXException {
		System.out.println("--Document Parsing Stated--");
	}
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.print("<"+qName+">");
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		String text = new String(ch, start, length);
		System.out.print(text);
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("</"+qName+">");
	}
	
	public void endDocument() throws SAXException {
		System.out.println("--Document Parsing Ended--");
	}
}

public class SAXReader {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/edurekaStudents.xml");
			FileInputStream fis = new FileInputStream(file);
			
			SAXHandler handler = new SAXHandler();
			
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			
			parser.parse(fis, handler);
			
		} catch (Exception e) {
			System.out.println("Some Exception : "+e);
		}

	}

}
