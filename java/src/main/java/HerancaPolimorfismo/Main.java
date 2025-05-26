package HerancaPolimorfismo;

public class Main {
    public static void main(String[] args) {
        // Exercício 01
        System.out.println("[Exercício 01]\n");
        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();

        // Exercício 02
        System.out.println("\n[Exercício 02]\n");
        Veiculo[] veiculo = new Veiculo[2];
        Carro carro = new Carro();
        veiculo[0] = carro;
        Bicicleta bike = new Bicicleta();
        veiculo[1] = bike;
        for (Veiculo i : veiculo) i.mover();

        // Exercício 03
        System.out.println("\n[Exercício 03]\n");
        Funcionario func = new Funcionario();
        Gerente ger = new Gerente();
        Desenvolvedor dev = new Desenvolvedor();
        func.salarioBase = 1800;
        ger.salarioBase = 3600;
        dev.salarioBase = 2700;
        System.out.printf("Salários\nFuncionário: R$%.2f\n", func.calcularSalario());
        System.out.printf("Gerente: R$%.2f\n", ger.calcularSalario());
        System.out.printf("Desenvolvedor: R$%.2f\n", dev.calcularSalario());

        // Exercício 04
        System.out.println("\n[Exercício 04]\n");
        Pagamento[] pagamentos = new Pagamento[2];
        PagamentoCartao cartao = new PagamentoCartao();
        pagamentos[0] = cartao;
        PagamentoDinheiro dinheiro = new PagamentoDinheiro();
        pagamentos[1] = dinheiro;
        for(Pagamento i : pagamentos) i.realizarPagamento();
    }
}
