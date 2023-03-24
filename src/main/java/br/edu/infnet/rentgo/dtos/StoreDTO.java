package br.edu.infnet.rentgo.dtos;


import br.edu.infnet.rentgo.entities.Vehicle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StoreDTO {
    public int idForm;
    public String nameForm;
    public String endForm;
    public String compForm;
    public String bairroForm;
    public String cidadeForm;
    public String estadoForm;
    public String cepForm;
    public List<Vehicle> vehicleDTOS;

    public StoreDTO() {
    }

    public StoreDTO(String nameForm, String endForm, String compForm, String bairroForm, String cidadeForm, String estadoForm, String cepForm) {
        this.nameForm = nameForm;
        this.endForm = endForm;
        this.compForm = compForm;
        this.bairroForm = bairroForm;
        this.cidadeForm = cidadeForm;
        this.estadoForm = estadoForm;
        this.cepForm = cepForm;
    }

    public StoreDTO(int idForm, String nameForm, String endForm, String compForm, String bairroForm, String cidadeForm, String estadoForm, String cepForm) {
        this.idForm = idForm;
        this.nameForm = nameForm;
        this.endForm = endForm;
        this.compForm = compForm;
        this.bairroForm = bairroForm;
        this.cidadeForm = cidadeForm;
        this.estadoForm = estadoForm;
        this.cepForm = cepForm;
    }

    public StoreDTO(int idForm, String nameForm, String endForm, String compForm, String bairroForm, String cidadeForm, String estadoForm, String cepForm, List<Vehicle> vehicles) {
        this.idForm = idForm;
        this.nameForm = nameForm;
        this.endForm = endForm;
        this.compForm = compForm;
        this.bairroForm = bairroForm;
        this.cidadeForm = cidadeForm;
        this.estadoForm = estadoForm;
        this.cepForm = cepForm;
        this.vehicleDTOS = vehicles;
    }

    public int getIdForm() {
        return idForm;
    }

    public void setIdForm(int idForm) {
        this.idForm = idForm;
    }

    public String getNameForm() {
        return nameForm;
    }

    public void setNameForm(String nameForm) {
        this.nameForm = nameForm;
    }

    public String getEndForm() {
        return endForm;
    }

    public void setEndForm(String endForm) {
        this.endForm = endForm;
    }

    public String getCompForm() {
        return compForm;
    }

    public void setCompForm(String compForm) {
        this.compForm = compForm;
    }

    public String getBairroForm() {
        return bairroForm;
    }

    public void setBairroForm(String bairroForm) {
        this.bairroForm = bairroForm;
    }

    public String getCidadeForm() {
        return cidadeForm;
    }

    public void setCidadeForm(String cidadeForm) {
        this.cidadeForm = cidadeForm;
    }

    public String getEstadoForm() {
        return estadoForm;
    }

    public void setEstadoForm(String estadoForm) {
        this.estadoForm = estadoForm;
    }

    public String getCepForm() {
        return cepForm;
    }

    public void setCepForm(String cepForm) {
        this.cepForm = cepForm;
    }

    public List<Vehicle> getVehicleDTOS() {
        return vehicleDTOS;
    }

    public void setVehicleDTOS(List<Vehicle> vehicleDTOS) {
        this.vehicleDTOS = vehicleDTOS;
    }
}
