package br.edu.infnet.rentgo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping(value = "/")
    public String indexRoot() {
        return "inicio";
    }

    @GetMapping(value = "/register")
    public String Register() {
        return "redirect:/usuarios/registrar";
    }

    @GetMapping(value = "/login")
    public String Login() {
        return "redirect:/usuarios/login";
    }

    @GetMapping(value = "/logout")
    public String Logout() {
        return "redirect:/usuarios/logout";
    }
}
