package br.edu.infnet.rentgo.controllers;

import br.edu.infnet.rentgo.dtos.CredentialUserDTO;
import br.edu.infnet.rentgo.services.CredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CredentialController {
    @Autowired
    private CredentialService service;

    @GetMapping(value="/login")
    public String login(){
        return "login";
    }

    @PostMapping(value="/login")
    public String loginForm(Model model, CredentialUserDTO userDTO){
        if(service.checkLogin(userDTO)){
            System.out.printf("Login Efetuado do usuário %s%n", userDTO.email);
            return "redirect:/home";
        };
        model.addAttribute("errorMsg", "As credenciais para o e-mail " + userDTO.email + "são inválidas!");
        System.out.println("ERRO de login.");
        return login();
    }

}
