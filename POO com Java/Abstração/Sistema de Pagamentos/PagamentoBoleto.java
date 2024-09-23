public class PagamentoBoleto extends Pagamento{
    private int codigo;

    @Override
    public void realizarPagamento() {
        System.out.println("O pagamento do boleto foi realizado com sucesso.");
    }
}
