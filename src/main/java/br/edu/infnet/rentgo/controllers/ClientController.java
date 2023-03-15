package br.edu.infnet.rentgo.controllers;

import br.edu.infnet.rentgo.dtos.ClientDTO;
import br.edu.infnet.rentgo.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClientController {
    @Autowired
    private ClientService service;
    @GetMapping(value = "/listar")
    public String ListClientScreen(Model model) {
        model.addAttribute("clientes", service.getAll());
        return "cliente/listar";
    }

    @GetMapping(value = "/registrar")
    public String RegisterClientScreen() {
        return "cliente/cadastro";
    }

    @PostMapping(value = "/registrar")
    public String insert(ClientDTO clientDTO) {
        boolean status = service.insert(clientDTO);
        if(status) {
            System.out.printf("Cliente %s adicionado", clientDTO.emailForm);
        } else {
            System.out.printf("Erro ao adicionar %s", clientDTO.emailForm);
        }
        return "redirect:/clientes/listar";
    }
}
