package br.edu.infnet.rentgo.entities;

import br.edu.infnet.rentgo.dtos.VehicleDTO;
import jakarta.persistence.*;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String placa;

    @ManyToOne
    private Store store;

    public Vehicle() {
    }

    public Vehicle(Integer id, String placa) {
        this.id = id;
        this.placa = placa;
    }

    public Vehicle(Integer id, String placa, Store store) {
        this.id = id;
        this.placa = placa;
        this.store = store;
    }

    public Vehicle(VehicleDTO vehicleDTO) {
        placa = vehicleDTO.getPlacaForm();
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

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
