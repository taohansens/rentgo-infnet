package br.edu.infnet.rentgo.controllers;

import br.edu.infnet.rentgo.dtos.BookingDTO;
import br.edu.infnet.rentgo.services.BookingService;
import br.edu.infnet.rentgo.services.ClientService;
import br.edu.infnet.rentgo.services.StoreService;
import br.edu.infnet.rentgo.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    private BookingService service;
    @Autowired
    private StoreService storeService;
    @Autowired
    private VehicleService vehicleService;
    @Autowired
    private ClientService clientService;


    @GetMapping(value = "/listar")
    public String ListBookingScreen(Model model) {
        model.addAttribute("bookings", service.getAll());
        return "booking/listar";
    }

    @GetMapping(value = "/registrar")
    public String RegisterVehicleScreen(Model model) {
        model.addAttribute("storesAvailable", storeService.getAll());
        model.addAttribute("vehiclesAvailable", vehicleService.getAll());
        model.addAttribute("clientsAvailable", clientService.getAll());
        return "booking/cadastro";
    }

    @PostMapping(value = "/registrar")
    public String insert(BookingDTO bookingDTO) {
        BookingDTO status = service.insert(bookingDTO);
        if(status != null) {
            System.out.printf("Reserva # %s adicionado", bookingDTO.getIdForm());
        } else {
            System.out.printf("Erro ao adicionar Reserva # %s", bookingDTO.getIdForm());
        }
        return "redirect:/booking/listar";
    }

    @GetMapping(value = "/{id}/delete")
    public String delete(@PathVariable int id) {
        service.delete(id);
        System.out.printf("[204] Reserva de id %s excluido com sucesso.", id);
        return "redirect:/booking/listar";
    }
}
