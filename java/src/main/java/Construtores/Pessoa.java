package Construtores;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa() {
        this.nome = "Desconhecido";
        this.idade = 0;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public static Pessoa criacaoPessoa(String nome, String idade) {
        Pessoa pessoa;
        if(nome.isBlank() || idade.isBlank()) {
            pessoa = new Pessoa();
        }
        else{
            try{
                pessoa = new Pessoa(nome, Integer.parseInt(idade));
            } catch (NumberFormatException e) {
                pessoa = new Pessoa();
            }
        }
        return pessoa;
    }
}
