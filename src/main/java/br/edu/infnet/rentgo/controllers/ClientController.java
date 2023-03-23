package br.edu.infnet.rentgo.controllers;

import br.edu.infnet.rentgo.dtos.ClientDTO;
import br.edu.infnet.rentgo.dtos.CredentialUserDTO;
import br.edu.infnet.rentgo.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String insert(ClientDTO clientDTO, @SessionAttribute("userLogged") CredentialUserDTO userLogged) {
        clientDTO.setCredentialIdForm(userLogged.idForm);
        ClientDTO status = service.insert(clientDTO);
        if(status != null) {
            System.out.printf("Cliente %s adicionado", clientDTO.getNameForm());
        } else {
            System.out.printf("Erro ao adicionar %s", clientDTO.getNameForm());
        }
        return "redirect:/clientes/listar";
    }

    @GetMapping(value = "/{id}/delete")
    public String delete(@PathVariable int id) {
        service.delete(id);
        System.out.printf("Usuário ID %s excluído com sucesso.", id);
        return "redirect:/clientes/listar";
    }
}
