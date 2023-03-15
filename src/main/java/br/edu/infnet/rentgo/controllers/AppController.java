package br.edu.infnet.rentgo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping(value = "/")
    public String indexRoot() {
        return "redirect:/login";
    }

    @GetMapping(value = "/home")
    public String home() {
        return "index";
    }
}
