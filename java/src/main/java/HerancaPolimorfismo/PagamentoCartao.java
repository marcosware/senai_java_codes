package HerancaPolimorfismo;

public class PagamentoCartao extends Pagamento {

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento com cartão aprovado!");
    }
}
