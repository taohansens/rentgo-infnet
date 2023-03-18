package br.edu.infnet.rentgo.controllers;

import br.edu.infnet.rentgo.dtos.CredentialUserDTO;
import br.edu.infnet.rentgo.services.CredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuarios")
public class CredentialController {
    @Autowired
    private CredentialService service;
    @GetMapping(value = "/listar")
    public String ListCredentialUserScreen(Model model) {
        model.addAttribute("usuarios", service.getAll());
        return "users/listar";
    }

    @GetMapping(value = "/registrar")
    public String RegisterClientScreen() {
        return "users/cadastro";
    }

    @PostMapping(value = "/registrar")
    public String insert(CredentialUserDTO userDTO) {
        boolean status = service.insert(userDTO);
        if(status) {
            System.out.printf("User %s adicionado", userDTO.emailForm);
        } else {
            System.out.printf("Erro ao adicionar %s", userDTO.passForm);
        }
        return "redirect:/usuarios/listar";
    }

    @GetMapping(value = "/{id}/delete")
    public String delete(@PathVariable int id) {
        CredentialUserDTO userDTO = service.delete(id);
        System.out.printf("Usuário %d %s excluído com sucesso.", userDTO.getIdForm(), userDTO.getEmailForm());
        return "redirect:/usuarios/listar";
    }

}
