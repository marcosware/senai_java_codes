package Construtores;

import java.util.Scanner;

public class Ex03_Sobrecarga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria contaA, contaB;
        System.out.println("ABERTURA DE CONTA BANCÁRIA\n(Construtor de três atributos)\n");
        System.out.print("Nome do Titular: ");
        String titular = sc.nextLine();
        System.out.print("Saldo: ");
        String saldo = sc.nextLine();
        System.out.print("Tipo de Conta: ");
        String tipoConta = sc.nextLine();
        contaA = new ContaBancaria(titular, Double.parseDouble(saldo), tipoConta);
        System.out.println("\nConta bancária criada com sucesso!\n");
        System.out.println("Titular da conta: " + contaA.getTitular());
        System.out.println("Saldo: " + contaA.getSaldo());
        System.out.print("Tipo de Conta: " + contaA.getTipoConta());
        System.out.println("\n\nABERTURA DE CONTA BANCÁRIA\n(Construtor de um atributo)");
        System.out.print("Nome do Titular: ");
        titular = sc.nextLine();
        contaB = new ContaBancaria(titular);
        System.out.println("\nConta bancária criada com sucesso!\n");
        System.out.println("Titular da conta: " + contaB.getTitular());
        System.out.println("Saldo: " + contaB.getSaldo());
        System.out.println("Tipo de conta: " + contaB.getTipoConta());
    }
}
