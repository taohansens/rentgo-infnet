package br.edu.infnet.rentgo.dtos;

public class ClientDTO {
    public String nameForm;
    public String emailForm;
    public String telForm;
    public String rgForm;
    public String cpfForm;
    public String cnhForm;
    public String endForm;
    public String compForm;
    public String bairroForm;
    public String cidadeForm;
    public String estadoForm;
    public String cepForm;
    public boolean verifiedForm;

    public ClientDTO(String nameForm, String emailForm, String telForm, String rgForm, String cpfForm, String cnhForm, String endForm, String compForm, String bairroForm, String cidadeForm, String estadoForm, String cepForm, boolean verifiedForm) {
        this.nameForm = nameForm;
        this.emailForm = emailForm;
        this.telForm = telForm;
        this.rgForm = rgForm;
        this.cpfForm = cpfForm;
        this.cnhForm = cnhForm;
        this.endForm = endForm;
        this.compForm = compForm;
        this.bairroForm = bairroForm;
        this.cidadeForm = cidadeForm;
        this.estadoForm = estadoForm;
        this.cepForm = cepForm;
        this.verifiedForm = verifiedForm;
    }

    public String getNameForm() {
        return nameForm;
    }

    public void setNameForm(String nameForm) {
        this.nameForm = nameForm;
    }

    public String getEmailForm() {
        return emailForm;
    }

    public void setEmailForm(String emailForm) {
        this.emailForm = emailForm;
    }

    public String getTelForm() {
        return telForm;
    }

    public void setTelForm(String telForm) {
        this.telForm = telForm;
    }

    public String getRgForm() {
        return rgForm;
    }

    public void setRgForm(String rgForm) {
        this.rgForm = rgForm;
    }

    public String getCpfForm() {
        return cpfForm;
    }

    public void setCpfForm(String cpfForm) {
        this.cpfForm = cpfForm;
    }

    public String getCnhForm() {
        return cnhForm;
    }

    public void setCnhForm(String cnhForm) {
        this.cnhForm = cnhForm;
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

    public boolean isVerifiedForm() {
        return verifiedForm;
    }

    public void setVerifiedForm(boolean verifiedForm) {
        this.verifiedForm = verifiedForm;
    }
}
