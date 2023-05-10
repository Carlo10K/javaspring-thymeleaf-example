package com.bolsadeidas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){

        return "forward:/app/index";    //sin reiniciar la pagina va a hacer un dispatcher dentro del mismo request hacia app/index, se mantienen los parametros del request y no cambia la ruta
        //return "redirect:https://www.google.com";          redirije hacia google
        //return "redirect:/app/index";   redirije hacia index en nuestra propia app
    }
}
