package entidades;

import exceptions.IdadeExceptions;

public class Candidato {
    
    // atributos
    private String nome;
    private Integer idade;

    // construtor
    public Candidato() {

    }
    public Candidato(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        if (idade < 16) {
            throw new IdadeExceptions("Usuario não tem idade minima para votar");
        }if (idade == 16) {
            throw new IdadeExceptions("De acordo com o artigo 14 da Constituição Federal, o voto é facultativo para jovens de 16 e 17 anos");
        }
        if (idade >= 18) {
            System.out.println("Votação permitida");
            this.idade = idade;
        }
    }
    

    



    
}
