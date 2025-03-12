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
        int escolha = 0;
        produto.menu(escolha);
        sc.close();


    }
}
