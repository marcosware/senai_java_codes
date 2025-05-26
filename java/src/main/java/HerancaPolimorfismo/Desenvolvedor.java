package HerancaPolimorfismo;

public class Desenvolvedor extends Funcionario {
    public String nome;
    public double salarioBase;

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.1);
    }
}
