package br.edu.infnet.rentgo.dtos;

import br.edu.infnet.rentgo.entities.Vehicle;

public class BookingDTO {
    public int idForm;
    public String dinicioForm;
    public String dfimForm;
    public String priceForm;
    public String paydForm;
    public String infoForm;

    public int clientIdForm;
    public String clientNameForm;
    public String clientCPFForm;

    public int vehicleIdForm;
    public String vehiclePlacaForm;

    public int storeIdForm;
    public String storeNameForm;
    public String storeLocalizationForm;

    public BookingDTO(int idForm, String dinicioForm, String dfimForm, String priceForm, String paydForm, String infoForm) {
        this.idForm = idForm;
        this.dinicioForm = dinicioForm;
        this.dfimForm = dfimForm;
        this.priceForm = priceForm;
        this.paydForm = paydForm;
        this.infoForm = infoForm;
    }

    public BookingDTO(int idForm, String dinicioForm, String dfimForm, String priceForm, String paydForm, String infoForm, int clientIdForm, int vehicleIdForm, int storeIdForm) {
        this.idForm = idForm;
        this.dinicioForm = dinicioForm;
        this.dfimForm = dfimForm;
        this.priceForm = priceForm;
        this.paydForm = paydForm;
        this.infoForm = infoForm;
        this.clientIdForm = clientIdForm;
        this.vehicleIdForm = vehicleIdForm;
        this.storeIdForm = storeIdForm;
    }

    public BookingDTO(Integer idForm, Integer clientIdForm, Integer vehicleIdForm, Integer storeIdForm) {
        this.idForm = idForm;
        this.clientIdForm = clientIdForm;
        this.vehicleIdForm = vehicleIdForm;
        this.storeIdForm = storeIdForm;
    }

    public BookingDTO() {
    }

    public int getIdForm() {
        return idForm;
    }

    public void setIdForm(int idForm) {
        this.idForm = idForm;
    }

    public String getDinicioForm() {
        return dinicioForm;
    }

    public void setDinicioForm(String dinicioForm) {
        this.dinicioForm = dinicioForm;
    }

    public String getDfimForm() {
        return dfimForm;
    }

    public void setDfimForm(String dfimForm) {
        this.dfimForm = dfimForm;
    }

    public String getPriceForm() {
        return priceForm;
    }

    public void setPriceForm(String priceForm) {
        this.priceForm = priceForm;
    }

    public String getPaydForm() {
        return paydForm;
    }

    public void setPaydForm(String paydForm) {
        this.paydForm = paydForm;
    }

    public String getInfoForm() {
        return infoForm;
    }

    public void setInfoForm(String infoForm) {
        this.infoForm = infoForm;
    }

    public int getClientIdForm() {
        return clientIdForm;
    }

    public void setClientIdForm(int clientIdForm) {
        this.clientIdForm = clientIdForm;
    }

    public String getClientNameForm() {
        return clientNameForm;
    }

    public void setClientNameForm(String clientNameForm) {
        this.clientNameForm = clientNameForm;
    }

    public String getClientCPFForm() {
        return clientCPFForm;
    }

    public void setClientCPFForm(String clientCPFForm) {
        this.clientCPFForm = clientCPFForm;
    }

    public int getVehicleIdForm() {
        return vehicleIdForm;
    }

    public void setVehicleIdForm(int vehicleIdForm) {
        this.vehicleIdForm = vehicleIdForm;
    }

    public String getVehiclePlacaForm() {
        return vehiclePlacaForm;
    }

    public void setVehiclePlacaForm(String vehiclePlacaForm) {
        this.vehiclePlacaForm = vehiclePlacaForm;
    }

    public int getStoreIdForm() {
        return storeIdForm;
    }

    public void setStoreIdForm(int storeIdForm) {
        this.storeIdForm = storeIdForm;
    }

    public String getStoreNameForm() {
        return storeNameForm;
    }

    public void setStoreNameForm(String storeNameForm) {
        this.storeNameForm = storeNameForm;
    }

    public String getStoreLocalizationForm() {
        return storeLocalizationForm;
    }

    public void setStoreLocalizationForm(String storeLocalizationForm) {
        this.storeLocalizationForm = storeLocalizationForm;
    }
}
