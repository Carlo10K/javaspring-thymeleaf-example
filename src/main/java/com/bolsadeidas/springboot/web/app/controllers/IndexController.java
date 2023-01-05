package com.bolsadeidas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    //@RequestMapping(value = "/index", method = RequestMethod.GET)
    //@RequestMapping(value = "/index")    //si no se le pone requestMethod es por default GET
    @GetMapping(value = {"/index","/","/home"})   //array de rutas, este get respondera a cualquiera de los endpoint
    public String index(){
        return "index";
    }





}
