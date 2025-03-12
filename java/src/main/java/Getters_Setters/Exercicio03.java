package Getters_Setters;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("CADASTRO DE PRODUTO");
        System.out.print("Nome: ");
        produto.setNome(sc.nextLine());
        boolean valido;
        do{
            System.out.print("Preço: R$");
            valido = produto.validaPreco(sc.nextDouble());
            if(!valido) {
                System.out.println("Preço inválido!");
            }
        }while(!valido);
        System.out.print("Estoque: ");
        produto.setEstoque(sc.nextInt());
        System.out.println("\nProduto registrado com sucesso!");
        int escolha;
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
                    produto.adicionarEstoque(sc.nextInt());
                    System.out.println("Estoque: " + produto.getEstoque());
                    break;
                case 2:
                    System.out.print("Quantidade (-): ");
                    if(!produto.removerEstoque(sc.nextInt())) {
                        System.out.println("Estoque insuficiente.");
                    }
                    System.out.println("Estoque: " + produto.getEstoque());
                    break;
                case 3:
                    System.out.println("Estoque: " + produto.getEstoque());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(escolha != 0);
    }
}
