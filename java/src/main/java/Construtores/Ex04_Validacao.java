package Construtores;

import java.util.Scanner;

public class Ex04_Validacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto;
        System.out.println("CADASTRO DE PRODUTO");
        System.out.println("(Valor positivo)");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        produto = new Produto(nome, preco);
        System.out.println("\nProduto cadastrado com sucesso!\n");
        System.out.println("Nome: " + produto.getNome());
        System.out.printf("Preço: R$%.2f ", produto.getPreco());


        System.out.println("\n\n(Valor negativo)");
        System.out.print("Nome: ");
        nome = sc.next();
        System.out.print("Preço: ");
        preco = sc.nextDouble();
        Produto produto2 = new Produto(nome, preco);
        System.out.println("\nProduto cadastrado com sucesso!\n");
        System.out.println("Nome: " + produto2.getNome());
        System.out.printf("Preço: R$%.2f ", produto2.getPreco());
    }
}
