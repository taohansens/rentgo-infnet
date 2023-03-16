package br.edu.infnet.rentgo.controllers;

import br.edu.infnet.rentgo.dtos.StoreDTO;
import br.edu.infnet.rentgo.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService service;
    @GetMapping(value = "/listar")
    public String ListClientScreen(Model model) {
        model.addAttribute("stores", service.getAll());
        return "store/listar";
    }

    @GetMapping(value = "/registrar")
    public String RegisterClientScreen() {
        return "store/cadastro";
    }

    @PostMapping(value = "/registrar")
    public String insert(StoreDTO storeDTO) {
        boolean status = service.insert(storeDTO);
        if(status) {
            System.out.printf("Cliente %s adicionado", storeDTO.nameForm);
        } else {
            System.out.printf("Erro ao adicionar %s", storeDTO.nameForm);
        }
        return "redirect:/store/listar";
    }
}
