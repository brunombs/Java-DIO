public class PagamentoBoleto extends Pagamento{
    private int codigo;

    @Override
    public void realizarPagamento() {
        System.out.println("O boleto no valor " + getValor() + " foi pago.");
    }
}
