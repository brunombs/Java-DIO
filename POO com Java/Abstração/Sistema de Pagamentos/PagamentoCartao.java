public class PagamentoCartao extends Pagamento{
    private int numeroCartao;

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado com sucesso!");
    }
}
