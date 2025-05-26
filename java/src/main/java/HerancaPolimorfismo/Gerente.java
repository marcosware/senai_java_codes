package HerancaPolimorfismo;

public class Gerente extends Funcionario {
    public String nome;
    public double salarioBase;

    @Override
    public double calcularSalario() {
        return salarioBase + 1000;
    }
}
