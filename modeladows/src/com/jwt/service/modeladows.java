package com.jwt.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
  
@Path("/modelado2017")
public class modeladows {
  
    @GET
    @Path("/{name}")
    public Response getMsg(@PathParam("name") String name) {
  
        String output = "Welcome   : " + name;
  
        return Response.status(200).entity(output).build();
  
    }
    
    @GET
    @Path("/multiply/{a}/{b}/{c}")
    public Response multiplication(
            @PathParam("a") String textA,
            @PathParam("b") String textB,
            @PathParam("c") String textC) {
		
		System.out.println("Requested multiplication: " + textA + " " + textB + " " + textC);
        String[] paramsText = {"multiplication", textA, textB, textC};
        Double x = Double.parseDouble(textA) * Double.parseDouble(textB) * Double.parseDouble(textC);
        
        return Response.status(200).entity(x.toString()).build();
    }
    
    @GET
    @Path("/sum/{a}/{b}")
    public Response multiplication(
            @PathParam("a") String textA,
            @PathParam("b") String textB) {
		
		System.out.println("Requested sum: " + textA + " " + textB);
        String[] paramsText = {"sum", textA, textB};
        Double x = Double.parseDouble(textA) + Double.parseDouble(textB);
        
        return Response.status(200).entity(x.toString()).build();
    }
}