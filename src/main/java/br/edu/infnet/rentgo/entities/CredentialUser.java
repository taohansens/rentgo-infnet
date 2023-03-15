package br.edu.infnet.rentgo.entities;

public class CredentialUser {
    private String email;
    private String password;

    public CredentialUser() {
    }
    public CredentialUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
