package Construtores;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        if(validaValor(preco)) {
            this.preco = preco;
        }
        else{
            this.preco = 0.0;
        }
    }

    public boolean validaValor(double preco) {
        boolean valido = true;
        if(preco < 0) {
            valido = false;
        }
        return valido;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
