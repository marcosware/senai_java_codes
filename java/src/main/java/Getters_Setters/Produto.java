package Getters_Setters;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public boolean validaPreco(double preco) {
        boolean valido = false;
        if(preco > 0) {
            valido = true;
            setPreco(preco);
        }
        return valido;
    }

    public void adicionarEstoque(int quantidade) {
        this.estoque += quantidade;
    }

    public boolean removerEstoque(int quantidade) {
        boolean sucesso = false;
        if(this.estoque >= quantidade) {
            sucesso = true;
            this.estoque -= quantidade;
        }
        return sucesso;
    }
}
