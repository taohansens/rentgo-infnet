package br.edu.infnet.rentgo.controllers;

import br.edu.infnet.rentgo.dtos.VehicleDTO;
import br.edu.infnet.rentgo.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService service;
    @GetMapping(value = "/listar")
    public String ListVehicleScreen(Model model) {
        model.addAttribute("vehicles", service.getAll());
        return "vehicle/listar";
    }

    @GetMapping(value = "/registrar")
    public String RegisterVehicleScreen() {
        return "vehicle/cadastro";
    }

    @PostMapping(value = "/registrar")
    public String insert(VehicleDTO vehicleDTO) {
        boolean status = service.insert(vehicleDTO);
        if(status) {
            System.out.printf("Cliente %s adicionado", vehicleDTO.getPlacaForm());
        } else {
            System.out.printf("Erro ao adicionar %s", vehicleDTO.getPlacaForm());
        }
        return "redirect:/vehicle/listar";
    }
}
