package Getters_Setters;

import java.util.Scanner;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositarValor(double valor) {
        this.saldo += valor;
    }

    public boolean sacarValor(double valor) {
        boolean sucesso = false;
        if(valor <= this.saldo) {
            this.saldo -= valor;
            sucesso = true;
        }
        return sucesso;
    }

    public void exibirSaldo() {
        System.out.printf("SALDO: R$%.2f\n", this.getSaldo());
    }

    public void menu(int escolha) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nPAINEL - CONTA BANCÁRIA");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Saldo");
            System.out.println("0 - Sair");
            System.out.print("OPÇÃO: ");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    System.out.print("DEPÓSITO: R$");
                    this.depositarValor(sc.nextDouble());
                    this.exibirSaldo();
                    break;
                case 2:
                    System.out.print("SAQUE: R$");
                    if (!this.sacarValor(sc.nextDouble())) {
                        System.out.println("Saldo insuficiente.");
                    }
                    this.exibirSaldo();
                    break;
                case 3:
                    this.exibirSaldo();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(escolha != 0);
        sc.close();
    }
}
