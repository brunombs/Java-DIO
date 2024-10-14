public class Vendedor extends Funcionario {
    private final double salarioBase;
    private final double comissaoDeVenda;

    public Vendedor(double salarioBase, double comissaoDeVenda) {
        this.salarioBase = salarioBase;
        this.comissaoDeVenda = comissaoDeVenda;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissaoDeVenda;
    }
}
