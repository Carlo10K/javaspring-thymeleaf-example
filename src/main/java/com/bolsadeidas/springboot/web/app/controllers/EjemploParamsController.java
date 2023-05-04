package com.bolsadeidas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

    @GetMapping("/")
    public String index(){
        return "params/index";
    }

    @GetMapping("/string")
    public String param(@RequestParam(name = "txt", required = false, defaultValue = "default") String txt, Model model){
        model.addAttribute("result","El texto enviado es: "+txt);
        return "params/ver";
    }
}
