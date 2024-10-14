public abstract class Pagamento {
    private double valor;
    public abstract void realizarPagamento();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
