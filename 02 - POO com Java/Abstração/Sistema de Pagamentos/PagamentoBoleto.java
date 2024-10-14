public class PagamentoBoleto extends Pagamento{
    private int codigo;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("O boleto com o código de barras " + getCodigo() + " no valor " + getValor() + " foi pago.");
    }
}
