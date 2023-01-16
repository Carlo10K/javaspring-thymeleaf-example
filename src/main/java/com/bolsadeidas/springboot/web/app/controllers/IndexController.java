package com.bolsadeidas.springboot.web.app.controllers;

import com.bolsadeidas.springboot.web.app.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/app")    //para una ruta general
public class IndexController {
    //Cualquiera de las formas responde con un template de thymeleaf a un get

    /*
    Con cualquiera de estas formas se puede hacer manejar un GET:
    //@RequestMapping(value = "/index", method = RequestMethod.GET)
    //@RequestMapping(value = "/index")    //si no se le pone requestMethod es por default GET
    //@GetMapping(value = "/index")
     */

    /*
    @GetMapping(value = {"/index","/","/home"})   //array de rutas, este get respondera a cualquiera de los endpoint
    public String index(Model model){             //utilizando model
        model.addAttribute("titulo","hola spring con model");
        return "index";     //retornara el template index
    }
     */

    /*

    @GetMapping(value = {"/index","/","/home"})   //array de rutas, este get respondera a cualquiera de los endpoint
    public String index(ModelMap model){          //utilizando ModelMap que no hay diferencia con Model
        model.addAttribute("titulo","hola spring con Mapmodel");
        return "index";
    }


    /*
    @GetMapping({"/index","/","/home"})
    public String index(Map<String, Object> map){         //utilizando Map
        map.put("titulo","Hola spring con map");
        return "index";
    }
    */

/*
    @GetMapping({"/index","/","/home"})
    public ModelAndView index(ModelAndView mv) {          //utilizando model and view
        mv.addObject("titulo", "Hola spring con modelView");
        mv.setViewName("index"); //la principal diferencia es que se le indica que template debe cargar
        return mv;
    }s
*/
    @RequestMapping({"/","/index","/home"})
    public String index(Model model){
        model.addAttribute("titulo","Hola spring con model");
        return "index";
    }

    @RequestMapping("/perfil")
    public String perfil(Model model) {
        User  user = new User();
        user.setNombre("Juan");
        user.setApellido("Lopez");
        model.addAttribute("usuario",user);
        model.addAttribute("titulo", "Perfil del usuario: ".concat(user.getNombre()));
        return "perfil";
    }





}
