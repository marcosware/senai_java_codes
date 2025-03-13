package Construtores;

import java.util.Scanner;

public class Ex02_ValorPadrao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa;
        System.out.println("CADASTRO DE PESSOA");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        String idade = sc.nextLine();
        if(nome.isBlank() || idade.isBlank()) {
            pessoa = new Pessoa();
        }
        else{
            pessoa = new Pessoa(nome, Integer.parseInt(idade));
        }
        System.out.println("\nCadastro realizado com sucesso!\n");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.print("Idade: " + pessoa.getIdade());
    }
}
