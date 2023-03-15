package br.edu.infnet.rentgo.dtos;

public class CredentialUserDTO {
    public String email;
    public String password;

    public CredentialUserDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
