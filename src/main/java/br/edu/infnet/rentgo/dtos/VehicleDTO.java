package br.edu.infnet.rentgo.dtos;

public class VehicleDTO {
    private int idForm;
    private String placaForm;

    private int idStoreForm;
    private String nameStoreForm;

    public VehicleDTO() {
    }

    public VehicleDTO(String placaForm) {
        this.placaForm = placaForm;
    }

    public VehicleDTO(int idForm, String placaForm) {
        this.idForm = idForm;
        this.placaForm = placaForm;
    }

    public VehicleDTO(int idForm, String placaForm, int idStoreForm, String nameStoreForm) {
        this.idForm = idForm;
        this.placaForm = placaForm;
        this.idStoreForm = idStoreForm;
        this.nameStoreForm = nameStoreForm;
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

    public int getIdStoreForm() {
        return idStoreForm;
    }

    public void setIdStoreForm(int idStoreForm) {
        this.idStoreForm = idStoreForm;
    }

    public String getNameStoreForm() {
        return nameStoreForm;
    }

    public void setNameStoreForm(String nameStoreForm) {
        this.nameStoreForm = nameStoreForm;
    }
}