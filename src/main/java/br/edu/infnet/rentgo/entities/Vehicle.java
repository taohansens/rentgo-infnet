package br.edu.infnet.rentgo.entities;

public class Vehicle {
    private long id;
    private long placa;

    public Vehicle() {
    }

    public Vehicle(long id, long placa) {
        this.id = id;
        this.placa = placa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPlaca() {
        return placa;
    }

    public void setPlaca(long placa) {
        this.placa = placa;
    }
}
