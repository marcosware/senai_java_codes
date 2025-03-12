package Getters_Setters;

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
}
