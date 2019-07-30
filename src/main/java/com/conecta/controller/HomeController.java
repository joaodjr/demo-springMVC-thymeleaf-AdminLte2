package com.conecta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by JOAO on 29/07/2019.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String init(){
        return "index";
    }

    @GetMapping("/graficos")
    public String graficos(){
        return "morris";
    }
}
