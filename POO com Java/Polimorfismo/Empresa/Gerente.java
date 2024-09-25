public class Gerente extends Funcionario {
    private double salario = 4500.30;
    private double comissao = 1455;

    @Override
    public double calcularSalario() {
        return salario + comissao;
    }
}
