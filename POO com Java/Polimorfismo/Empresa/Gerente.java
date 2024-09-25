public class Gerente extends Funcionario {
    private double salario;
    private double comissao;

    public Gerente(double salario, double comissao){
        this.salario = salario;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salario + comissao;
    }
}
