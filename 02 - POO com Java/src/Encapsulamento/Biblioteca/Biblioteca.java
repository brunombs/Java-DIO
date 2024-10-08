public class Biblioteca {
    public static void main(String[] args) {
        DadosBiblioteca biblioteca = new DadosBiblioteca();

        biblioteca.setNome("Bruno Livros");
        biblioteca.setEndereco("Rua do Bruno");
        biblioteca.setInauguracao(1997);

        System.out.println("A biblioteca " + biblioteca.getNome() + " foi inaugurada em " + biblioteca.getInauguracao() + " no endereço: " + biblioteca.getEndereco());
    }
}
