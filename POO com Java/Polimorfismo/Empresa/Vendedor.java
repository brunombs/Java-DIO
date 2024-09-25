public class Vendedor extends Funcionario {
    private final double salarioBase = 2100.99;
    private final double comissaoDeVenda = 500;

    @Override
    public double calcularSalario() {
        return salarioBase + comissaoDeVenda;
    }
}
