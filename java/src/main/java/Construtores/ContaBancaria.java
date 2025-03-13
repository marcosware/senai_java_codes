package Construtores;

public class ContaBancaria {
    String titular;
    double saldo;
    String tipoConta;

    public ContaBancaria(String titular, double saldo, String tipoConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.tipoConta = "Corrente";
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }
}
