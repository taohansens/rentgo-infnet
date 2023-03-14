package br.edu.infnet.rentgo.controllers;

import br.edu.infnet.rentgo.dtos.ClientDTO;
import br.edu.infnet.rentgo.entities.Client;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClientController {
    @PostMapping(value = "/registrar")
    public String insert(ClientDTO clientDTO) {
        Client client = new Client(clientDTO);
        System.out.println(client);
        return "redirect:/";
    }
}
