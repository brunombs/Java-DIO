public class MainPagamentos {
    public static void main(String[] args) {
        PagamentoCartao pagcard = new PagamentoCartao();
        PagamentoBoleto pagboleto = new PagamentoBoleto();

        pagcard.setValor(3845.52);
        pagboleto.setValor(1071.04);

        System.out.println("A fatura do cartão no valor " + pagcard.getValor() + " foi paga.");
        System.out.println("O boleto no valor " + pagboleto.getValor() + " foi pago.");
    }
}
