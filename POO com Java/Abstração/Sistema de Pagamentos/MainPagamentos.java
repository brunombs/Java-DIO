public class MainPagamentos {
    public static void main(String[] args) {
        PagamentoCartao pagcard = new PagamentoCartao();
        PagamentoBoleto pagboleto = new PagamentoBoleto();


        pagcard.setValor(3845.52);
        pagboleto.setValor(1071.04);

        pagcard.realizarPagamento();
        pagboleto.realizarPagamento();
    }
}
