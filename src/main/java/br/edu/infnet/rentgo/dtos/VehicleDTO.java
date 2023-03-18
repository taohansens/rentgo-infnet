package br.edu.infnet.rentgo.dtos;

public class VehicleDTO {
    public int idForm;
    public String placaForm;

    public VehicleDTO() {
    }

    public VehicleDTO(String placaForm) {
        this.placaForm = placaForm;
    }

    public VehicleDTO(int idForm, String placaForm) {
        this.idForm = idForm;
        this.placaForm = placaForm;
    }

    public int getIdForm() {
        return idForm;
    }

    public void setIdForm(int idForm) {
        this.idForm = idForm;
    }

    public String getPlacaForm() {
        return placaForm;
    }

    public void setPlacaForm(String placaForm) {
        this.placaForm = placaForm;
    }
}