package br.edu.infnet.rentgo.entities;
import br.edu.infnet.rentgo.dtos.ClientDTO;
import br.edu.infnet.rentgo.dtos.StoreDTO;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Store {
    private long id;
    private String name;
    private Address address;
    private Set<Vehicle> vehicles = new HashSet<>();

    public Store() {
    }

    public Store(long id, String name, Address address, Set<Vehicle> vehicles) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.vehicles = vehicles;
    }

    public Store(StoreDTO storeDTO) {
        name = storeDTO.nameForm;
        address = new Address(storeDTO.cepForm, storeDTO.endForm, storeDTO.compForm, storeDTO.bairroForm,
                storeDTO.cidadeForm, storeDTO.estadoForm);
        vehicles = storeDTO.vehicleDTOS.stream().map(Vehicle::new).collect(Collectors.toSet());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return id == store.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
