package co.edureka.web;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import org.glassfish.jersey.servlet.ServletContainer;

@Path("/hello")
public class Hello {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(){
		Date date = new Date();
		String response = "Hello from WebService. Its "+date;
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){
		Date date = new Date();
		String response = "<html><body><h2>Hello from WebService. Its "+date+"</h2></body></html>";
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){
		Date date = new Date();
		String response = "<?xml version='1.0'?><hello>Hello from WebService. Its "+date+"</hello>";
		return response;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON) // Type of Response which will be sent back..
	public String sayJSONHello(){
		Date date = new Date();
		String response = "{ "
							+ "message : Search the Candle Rather than cursing the darkness"
							+ "date : "+date
						+ "}";
		return response;
	}
	
}
