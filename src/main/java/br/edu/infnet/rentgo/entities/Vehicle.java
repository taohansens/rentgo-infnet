package br.edu.infnet.rentgo.entities;

import br.edu.infnet.rentgo.dtos.VehicleDTO;

public class Vehicle {
    private long id;
    private String placa;

    public Vehicle() {
    }

    public Vehicle(long id, String placa) {
        this.id = id;
        this.placa = placa;
    }

    public Vehicle(VehicleDTO vehicleDTO) {
        placa = vehicleDTO.placaForm;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
