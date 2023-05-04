package com.bolsadeidas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {

    //public String variables(@PathVariable(name="texto") String  otrotexto) alrernativa para el nomvbre del parametro

        @GetMapping("/string/{texto}")
    public String variables(@PathVariable(name="texto") String  texto, Model model){
            model.addAttribute("titulo", "Recibir parametros de la ruta (@PathVariable)");
            model.addAttribute("result","El texto enviado en la ruta es :" + texto);
        return "variables/ver";
    }
}