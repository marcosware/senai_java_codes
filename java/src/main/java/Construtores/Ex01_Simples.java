package Construtores;

import java.util.Scanner;

public class Ex01_Simples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CADASTRO DE VEÍCULOS");
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.print("Ano: ");
        int ano = sc.nextInt();
        Carro carro = new Carro(marca, ano);
        System.out.println("\nCadastro realizado com sucesso!\n");
        System.out.println("Marca: " + carro.getMarca());
        System.out.print("Ano: " + carro.getAno());
    }

}
