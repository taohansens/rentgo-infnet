package br.edu.infnet.rentgo.repositories;

import br.edu.infnet.rentgo.entities.CredentialUser;
import org.springframework.stereotype.Repository;

import java.util.Objects;

@Repository
public class CredentialRepository {
    private final String admin = "admin@rentgo.com";
    private final String pass = "admin123@";

    public boolean login(CredentialUser user) {
        return Objects.equals(user.getEmail(), admin) && Objects.equals(user.getPassword(), pass);
    }
}
