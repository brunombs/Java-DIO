public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(int matricula, String nome, String cpf){
        super(cpf, nome); // Chama o construtor da classe Pessoa
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
}
