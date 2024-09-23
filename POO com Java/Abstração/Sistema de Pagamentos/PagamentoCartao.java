public class PagamentoCartao extends Pagamento{
    private int numeroCartao;

    @Override
    public void realizarPagamento() {
        System.out.println("A fatura do cartão no valor " + getValor() + " foi paga.");
    }
}
