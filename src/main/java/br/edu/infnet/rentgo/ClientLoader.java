package br.edu.infnet.rentgo;

import br.edu.infnet.rentgo.dtos.ClientDTO;
import br.edu.infnet.rentgo.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;

@Component
public class ClientLoader implements ApplicationRunner {

    @Autowired
    private ClientService clientService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(LocalDateTime.now() + " [ClientLoader] Init.");
        try {
            String arquivo = "DATAclients.txt";
            try {
                FileReader fileR = new FileReader(arquivo);
                BufferedReader leitura = new BufferedReader(fileR);

                String linha = leitura.readLine();
                String[] campos = null;

                while (linha != null) {
                    campos = linha.split(";");
                    ClientDTO clientDTO = new ClientDTO(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], campos[6], campos[7], campos[8], campos[9], campos[10], Boolean.parseBoolean(campos[11]));
                    clientService.insert(clientDTO);
                    linha = leitura.readLine();
                }
                leitura.close();
                fileR.close();
            } catch (IOException e) {
                System.out.println("[ERRO] " + e.getMessage());
            }
        } finally {
            System.out.println(LocalDateTime.now() + " [ClientLoader] Finished. Users Added.");
        }
    }
}

