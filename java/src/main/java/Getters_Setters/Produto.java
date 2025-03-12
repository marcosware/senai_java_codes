package Getters_Setters;

import java.util.Scanner;

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

    public void menu(int escolha) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nPAINEL - CONTROLE DE ESTOQUE");
            System.out.println("1 - Adicionar ao estoque");
            System.out.println("2 - Remover do estoque");
            System.out.println("3 - Estoque atual");
            System.out.println("0 - Sair");
            System.out.print("OPÇÃO: ");
            escolha = sc.nextInt();
            switch(escolha) {
                case 1:
                    System.out.print("Quantidade (+): ");
                    this.adicionarEstoque(sc.nextInt());
                    System.out.println("Estoque: " + this.getEstoque());
                    break;
                case 2:
                    System.out.print("Quantidade (-): ");
                    if(!this.removerEstoque(sc.nextInt())) {
                        System.out.println("Estoque insuficiente.");
                    }
                    System.out.println("Estoque: " + this.getEstoque());
                    break;
                case 3:
                    System.out.println("Estoque: " + this.getEstoque());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(escolha != 0);
        sc.close();
    }
}
