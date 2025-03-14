package Construtores;

import java.util.Locale;
import java.util.Scanner;

public class Ex04_Validacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto produtoA, produtoB;
        System.out.println("CADASTRO DE PRODUTO");
        System.out.println("(Valor positivo)");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        double preco;
        do{
            System.out.print("Preço: ");
            preco = sc.nextDouble();
            if(preco < 0) {
                System.out.println("Estamos testando primeiro o valor positivo\nInsira novamente!");
            }
        }while(preco < 0);
        produtoA = new Produto(nome, preco);
        System.out.println("\nProduto cadastrado com sucesso!\n");
        System.out.println("Nome: " + produtoA.getNome());
        System.out.printf("Preço: R$%.2f ", produtoA.getPreco());

        System.out.println("\n\n(Valor negativo)");
        System.out.print("Nome: ");
        nome = sc.next();
        do{
            System.out.print("Preço: ");
            preco = sc.nextDouble();
            if(preco >= 0) {
                System.out.println("Estamos testando agora o valor negativo\nInsira novamente!");
            }
        }while(preco >= 0);
        produtoB = new Produto(nome, preco);
        System.out.println("\nProduto cadastrado com sucesso!\n");
        System.out.println("Nome: " + produtoB.getNome());
        System.out.printf("Preço: R$%.2f ", produtoB.getPreco());
    }
}
