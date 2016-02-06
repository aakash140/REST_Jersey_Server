package com.java.ws.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calculator")
public class Calculator {

	@GET
	@Path("pow/{number}/{power}")
	@Produces(MediaType.TEXT_PLAIN)
	public String power(@PathParam("number")int number,@PathParam("power")int power){
		return number+" raised to the power "+power+" is "+Math.pow(number, power);
	}	

	@GET
	@Path("sqrt/{number}")
	@Produces(MediaType.APPLICATION_XML)
	public String squareRoot(@PathParam("number")int number){
		String xmlFormat="<calculator>"
				+"<input-number>"+number+"</input-number>"
				+"<square-root>"+(Math.sqrt(number))+"</square-root>"
				+"</calculator>";
		return xmlFormat;
	}



}