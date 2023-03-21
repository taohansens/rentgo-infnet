package br.edu.infnet.rentgo.controllers;

import br.edu.infnet.rentgo.dtos.VehicleDTO;
import br.edu.infnet.rentgo.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        VehicleDTO status = service.insert(vehicleDTO);
        if(status.getIdForm() > 0) {
            System.out.println("[201] Veiculo de placa " + status.getPlacaForm() + " adicionado");
        } else {
            System.out.println("[400] Veiculo de placa " + status.getPlacaForm() + " não adicionada");
        }
        return "redirect:/vehicle/listar";
    }

    @GetMapping(value = "/{id}/delete")
    public String delete(@PathVariable int id) {
        service.delete(id);
        System.out.printf("[204] Veiculo de placa %s excluido com sucesso.", id);
        return "redirect:/vehicle/listar";
    }
}
