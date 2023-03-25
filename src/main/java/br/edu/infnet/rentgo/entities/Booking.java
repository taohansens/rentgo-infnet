package br.edu.infnet.rentgo.entities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String date;
    private String finalDate;
    private double price;
    private boolean payed;
    private String info;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Store store;
    @OneToOne
    private Vehicle vehicle;


    public Booking() {
    }

    public Booking(Integer id, String date, String finalDate, double price, boolean payed, String info, Client client, Store store, Vehicle vehicle) {
        this.id = id;
        this.date = date;
        this.finalDate = finalDate;
        this.price = price;
        this.payed = payed;
        this.info = info;
        this.client = client;
        this.store = store;
        this.vehicle = vehicle;
    }

    public Booking(Integer id, String date, String finalDate, double price, boolean payed, String info) {
        this.id = id;
        this.date = date;
        this.finalDate = finalDate;
        this.price = price;
        this.payed = payed;
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPayed() {
        return payed;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(id, booking.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
