package br.edu.infnet.rentgo;

import br.edu.infnet.rentgo.dtos.StoreDTO;
import br.edu.infnet.rentgo.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;

@Component
public class StoreLoader implements ApplicationRunner {

    @Autowired
    private StoreService storeService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(LocalDateTime.now() + " [Store Loader] Init.");
        try {
            String arquivo = "DATAstore.txt";
            try{
                FileReader fileR = new FileReader(arquivo);
                BufferedReader leitura = new BufferedReader(fileR);

                String linha = leitura.readLine();
                String[] campos = null;

                while (linha != null) {
                    campos = linha.split(";");
                    StoreDTO storeDTO = new StoreDTO(campos[0],campos[1],campos[2],campos[3],campos[4],campos[5],campos[6]);
                    storeService.insert(storeDTO);
                    linha = leitura.readLine();
                }
                leitura.close();
                fileR.close();
            } catch (IOException e){
                System.out.println("[ERRO] " + e.getMessage());
            }
        } finally {
            System.out.println(LocalDateTime.now() + " [Store Loader] Finished. Users Added.");
        }
    }
}

