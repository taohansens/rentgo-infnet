package br.edu.infnet.rentgo;

import br.edu.infnet.rentgo.dtos.CredentialUserDTO;
import br.edu.infnet.rentgo.entities.CredentialUser;
import br.edu.infnet.rentgo.services.CredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Order(1)
@Component
public class UserLoader implements ApplicationRunner {

    @Autowired
    private CredentialService credentialService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(LocalDateTime.now() + " [UserLoader] Init.");
        try {
            String arquivo = "DATAcredentialUsers.txt";
            try{
                FileReader fileR = new FileReader(arquivo);
                BufferedReader leitura = new BufferedReader(fileR);

                String linha = leitura.readLine();
                String[] campos = null;

                while (linha != null) {
                    campos = linha.split(";");
                    CredentialUser credentialUser = new CredentialUser(campos[0], campos[1]);
                    credentialService.insert(new CredentialUserDTO(credentialUser.getEmail(), credentialUser.getPassword()));
                    linha = leitura.readLine();
                }
                leitura.close();
                fileR.close();
            } catch (IOException e){
                System.out.println("[ERRO] " + e.getMessage());
            }
        } finally {
            System.out.println(LocalDateTime.now() + " [UserLoader] Finished. Users Added.");
        }
    }
}

