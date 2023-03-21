package br.edu.infnet.rentgo.entities;

import br.edu.infnet.rentgo.dtos.VehicleDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String placa;

    public Vehicle() {
    }

    public Vehicle(Integer id, String placa) {
        this.id = id;
        this.placa = placa;
    }

    public Vehicle(VehicleDTO vehicleDTO) {
        placa = vehicleDTO.placaForm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
