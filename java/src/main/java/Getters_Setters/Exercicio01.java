package Getters_Setters;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.print("Digite o nome da pessoa: ");
        pessoa.setNome(sc.nextLine());
        System.out.print("Digite a idade da pessoa: ");
        pessoa.setIdade(sc.nextInt());
        System.out.println("\nCadastrado com sucesso!");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
