public class PagamentoCartao extends Pagamento{
    private int numeroCartao;

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("A fatura do cartão no valor " + getValor() + " foi paga com o cartão número " + getNumeroCartao());
    }
}
