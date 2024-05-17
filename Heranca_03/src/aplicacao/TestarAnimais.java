package aplicacao;

import entidades.Mamifero;
import entidades.Peixe;
import entidades.Animal;

public class TestarAnimais {
    public static void main(String[] args) {
        
        //Criando objeto camelo
        Mamifero camelo = new Mamifero("Camelo", 150.0f, 4, "Amarelo", "Terra", 2.0f, "BROBRA");
        Peixe tubarao = new Peixe("Tubarão", 300.0f, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e Cauda");
        Mamifero ursoCanada = new Mamifero("Urso do Canada", 180.0f, 4, "vermelho", "Terra", 0.5f, "Mel");

        camelo.dados();
        tubarao.dados();
        ursoCanada.dados();

        

        



    
    
    }
}
