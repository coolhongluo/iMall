package com.service.imall.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-10T08:40:10.652Z")

@RestSchema(schemaId = "imall")
@RequestMapping(path = "/imall", produces = MediaType.APPLICATION_JSON)
public class ImallImpl {

    @Autowired
    private ImallDelegate userImallDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userImallDelegate.helloworld(name);
    }

}
