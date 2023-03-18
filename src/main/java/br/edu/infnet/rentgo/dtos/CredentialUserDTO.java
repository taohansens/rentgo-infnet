package br.edu.infnet.rentgo.dtos;

public class CredentialUserDTO {
    public int idForm;
    public String emailForm;
    public String passForm;

    public CredentialUserDTO() {
    }

    public CredentialUserDTO(String emailForm, String passForm) {
        this.emailForm = emailForm;
        this.passForm = passForm;
    }

    public CredentialUserDTO(int idForm, String emailForm, String passForm) {
        this.idForm = idForm;
        this.emailForm = emailForm;
        this.passForm = passForm;
    }

    public long getIdForm() {
        return idForm;
    }

    public void setIdForm(int idForm) {
        this.idForm = idForm;
    }

    public String getEmailForm() {
        return emailForm;
    }

    public void setEmailForm(String emailForm) {
        this.emailForm = emailForm;
    }

    public String getPassForm() {
        return passForm;
    }

    public void setPassForm(String passForm) {
        this.passForm = passForm;
    }
}
