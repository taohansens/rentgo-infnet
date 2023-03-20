package br.edu.infnet.rentgo;

import br.edu.infnet.rentgo.dtos.VehicleDTO;
import br.edu.infnet.rentgo.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;

@Component
public class VehicleLoader implements ApplicationRunner {

    @Autowired
    private VehicleService vehicleService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(LocalDateTime.now() + " [Vehicle Loader] Init.");
        try {
            String arquivo = "DATAvehicles.txt";
            try{
                FileReader fileR = new FileReader(arquivo);
                BufferedReader leitura = new BufferedReader(fileR);

                String linha = leitura.readLine();
                String[] campos = null;

                while (linha != null) {
                    campos = linha.split(";");
                    VehicleDTO vehicleDTO = new VehicleDTO(campos[0]);
                    vehicleService.insert(vehicleDTO);
                    linha = leitura.readLine();
                }
                leitura.close();
                fileR.close();
            } catch (IOException e){
                System.out.println("[ERRO] " + e.getMessage());
            }
        } finally {
            System.out.println(LocalDateTime.now() + " [VehicleLoader] Finished. Users Added.");
        }
    }
}

