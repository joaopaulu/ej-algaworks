package capture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {
    public static void main(String[] args) {
        try{
            Path arquivo = Path.of("/var/www/algaworks/ej-algaworks/16-excecoes/capture/error.txt");
            Files.createFile(arquivo);
        }catch (IOException e){
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
