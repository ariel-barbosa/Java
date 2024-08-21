import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Teste {
    public static void main(String[] args) throws IOException{


        Path arquivo = Paths.get("D:/htdocs/agenda/texto.txt");

        List<String> linhas = Files.readAllLines(arquivo);

        for (String linha : linhas) {
            System.out.println(linha);
        }
       
    }
}
