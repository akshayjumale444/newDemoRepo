package com.lti.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService 
{
	//http://localhost:8087/MyFirstWS/rest/hello  ==>URI	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello()
	{
		return "Plain Text......Hello";
	}
	
	//http://localhost:8087/MyFirstWS/rest/hello/xml  ==>URI	
	@GET
	@Path("/xml")
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello()
	{
		return "<hello>Welcome to RESTful web service xml</hello>";
	}
	
	//http://localhost:8087/MyFirstWS/rest/hello  ==>URI	
	@GET
	@Path("/html")
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello()
	{
		return "<font color=red size=8>Hello Everybody to HTML</font>";
	}
	
	
}
