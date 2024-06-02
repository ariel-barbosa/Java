package entidades;

import exceptions.IdadeExceptions;

public class Candidato {
    
    // atributos
    
    private Integer idade;

    // construtor
    public Candidato() {

    }
    public Candidato(Integer idade) {
        
        this.idade = idade;
    }


    
    
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        if (idade < 16) {
            throw new IdadeExceptions("Usuario não tem idade minima para votar");
        }
        if (idade >= 16) {
            System.out.println("Votação permitida. De acordo com o artigo 14 da Constituição Federal, o voto é facultativo para jovens de 16 e 17 anos");
            this.idade = idade;
        }
    }
    

    



    
}
