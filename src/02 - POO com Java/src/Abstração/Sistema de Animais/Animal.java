public abstract class Animal {
    String nome;

    public abstract String fazerSom();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
