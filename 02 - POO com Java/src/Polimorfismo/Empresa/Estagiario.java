public class Estagiario extends Funcionario{
    private final double salario;

    public Estagiario(double salario){
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}
