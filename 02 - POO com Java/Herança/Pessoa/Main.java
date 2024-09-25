public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.setNome("Bruno");
        estudante.setIdade(27);
        estudante.setMatricula(425);

        System.out.println("O estudante " + estudante.getNome() + " tem " + estudante.getIdade() + " anos e o núme" +
                "ro de matrícula na faculdade é: " + estudante.getMatricula());
    }
}
