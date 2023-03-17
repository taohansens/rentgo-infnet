package br.edu.infnet.rentgo.dtos;

public class VehicleDTO {
    public String placaForm;

    public VehicleDTO(String placaForm) {
        this.placaForm = placaForm;
    }

    public String getPlacaForm() {
        return placaForm;
    }

    public void setPlacaForm(String placaForm) {
        this.placaForm = placaForm;
    }
}