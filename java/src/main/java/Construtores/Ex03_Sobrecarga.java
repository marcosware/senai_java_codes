package Construtores;

import java.util.Scanner;

public class Ex03_Sobrecarga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa;
        System.out.println("ABERTURA DE CONTA BANCÁRIA");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        String idade = sc.nextLine();
        pessoa = Pessoa.criacaoPessoa(nome, idade);
        System.out.println("\nCadastro realizado com sucesso!\n");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.print("Idade: " + pessoa.getIdade());
    }
}
