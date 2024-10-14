public class CadastroEstudante {
    public static void main(String[] args) {
        Aluno bruno = new Aluno(405, "Bruno", "123.456.789-00");
        System.out.println(bruno.getNome() + "-" + bruno.getCpf());
    }
}
