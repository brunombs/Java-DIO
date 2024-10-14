public class MainPagamentos {
    public static void main(String[] args) {
        PagamentoCartao pagcard = new PagamentoCartao();
        PagamentoBoleto pagboleto = new PagamentoBoleto();


        pagcard.setValor(3845.52);
        pagcard.setNumeroCartao(808808);
        pagboleto.setValor(1071.04);
        pagboleto.setCodigo(105501);

        pagcard.realizarPagamento();
        pagboleto.realizarPagamento();
    }
}
