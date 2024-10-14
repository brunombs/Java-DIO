package main.java.list.OperacoesBasicas;

public class Item {
    private final String nome;
    private final int quantidade;
    private final double preco;

    public Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "\nItem: " + nome + ", Quantidade: " + quantidade + ", Preço: " + preco;
    }
}
