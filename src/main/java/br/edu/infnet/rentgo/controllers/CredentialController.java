package br.edu.infnet.rentgo.controllers;

import br.edu.infnet.rentgo.dtos.CredentialUserDTO;
import br.edu.infnet.rentgo.services.CredentialService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("userLogged")
@RequestMapping("/usuarios")
public class CredentialController {
    public String msg;
    @Autowired
    private CredentialService service;

    @GetMapping(value = "/login")
    public String Login() {
        return "/users/login";
    }

    @PostMapping(value = "/login")
    public String autenticar(Model model, CredentialUserDTO credentialUserDTO) {
        CredentialUserDTO userLogged = service.login(credentialUserDTO);
        if (userLogged != null) {
            model.addAttribute("userLogged", userLogged);
            System.out.println("Logado com sucesso. " + userLogged.emailForm);
            return "redirect:/";
        }
        System.out.println("Credenciais incorretas para o email " + credentialUserDTO.emailForm);
        model.addAttribute("mensagem", "Credenciais incorretas para o email " + credentialUserDTO.emailForm);
        return "users/login";

    }

    @GetMapping(value = "/listar")
    public String ListCredentialUserScreen(Model model) {
        model.addAttribute("usuarios", service.getAll());
        return "users/listar";
    }

    @GetMapping(value = "/registrar")
    public String RegisterClientScreen() {
        return "users/register";
    }

    @PostMapping(value = "/registrar")
    public String insert(CredentialUserDTO userDTO) {
        CredentialUserDTO status = service.insert(userDTO);
        if (status.getIdForm() > 0) {
            System.out.printf("User %s adicionado", status.emailForm);
        } else {
            System.out.printf("Erro ao adicionar %s", status.passForm);
        }
        return "redirect:/";
    }

    @GetMapping(value = "/{id}/delete")
    public String delete(@PathVariable int id) {
        service.delete(id);
        System.out.printf("Usuário %d excluído com sucesso.", id);
        return "redirect:/usuarios/listar";
    }

    @GetMapping(value = "/logout")
    public String logout(HttpSession session, SessionStatus status){
        status.setComplete();
        session.removeAttribute("userLogged");
        return "redirect:/";
    }

}
