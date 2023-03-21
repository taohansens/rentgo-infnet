package br.edu.infnet.rentgo.repositories;

import br.edu.infnet.rentgo.entities.CredentialUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialRepository extends CrudRepository<CredentialUser, Integer> {
    @Query("from CredentialUser c where c.email = :email and c.password = :password")
    CredentialUser autenticacao(String email, String password);
}