package Getters_Setters;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        System.out.println("CADASTRO DE CONTA BANCÁRIA");
        System.out.print("Titular da conta: ");
        conta.setTitular(sc.nextLine());
        System.out.print("Saldo da conta: ");
        conta.setSaldo(sc.nextDouble());
        System.out.println("\nConta criada com sucesso!");
        int escolha;
        do{
            System.out.println("\nPAINEL - CONTA BANCÁRIA");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Saldo");
            System.out.println("0 - Sair");
            System.out.print("OPÇÃO: ");
            escolha = sc.nextInt();
            switch(escolha) {
                case 1:
                    System.out.print("DEPÓSITO: R$");
                    conta.depositarValor(sc.nextDouble());
                    conta.exibirSaldo();
                    break;
                case 2:
                    System.out.print("SAQUE: R$");
                    if(!conta.sacarValor(sc.nextDouble())) {
                        System.out.println("Saldo insuficiente.");
                    }
                    conta.exibirSaldo();
                    break;
                case 3:
                    conta.exibirSaldo();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(escolha != 0);
    }
}
