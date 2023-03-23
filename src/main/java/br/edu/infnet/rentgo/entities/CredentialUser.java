package br.edu.infnet.rentgo.entities;

import br.edu.infnet.rentgo.dtos.CredentialUserDTO;
import jakarta.persistence.*;

@Entity
public class CredentialUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String password;

    public CredentialUser() {
    }

    public CredentialUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public CredentialUser(CredentialUserDTO credentialUserDTO) {
        email = credentialUserDTO.emailForm;
        password = credentialUserDTO.passForm;
    }

    public CredentialUser(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
