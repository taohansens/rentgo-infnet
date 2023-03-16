package br.edu.infnet.rentgo.dtos;

public class AddressDTO {
   public String endForm;
    public String compForm;
    public String bairroForm;
    public String cidadeForm;
    public String estadoForm;
    public String cepForm;

    public AddressDTO(String endForm, String compForm, String bairroForm, String cidadeForm, String estadoForm, String cepForm) {
        this.endForm = endForm;
        this.compForm = compForm;
        this.bairroForm = bairroForm;
        this.cidadeForm = cidadeForm;
        this.estadoForm = estadoForm;
        this.cepForm = cepForm;
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
}
