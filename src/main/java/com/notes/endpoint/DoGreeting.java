package com.notes.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class DoGreeting {

    @GET
    public String doHello(){
        return "hello there...";
    }

}
