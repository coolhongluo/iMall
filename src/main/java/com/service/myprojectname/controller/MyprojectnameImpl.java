package com.service.myprojectname.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-15T09:08:39.604Z")

@RestSchema(schemaId = "myprojectname")
@RequestMapping(path = "/myprojectname", produces = MediaType.APPLICATION_JSON)
public class MyprojectnameImpl {

    @Autowired
    private MyprojectnameDelegate userMyprojectnameDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userMyprojectnameDelegate.helloworld(name);
    }

}
