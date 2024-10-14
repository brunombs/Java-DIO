package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private final List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, quantidade, preco);
        this.itens.add(item);
    }

    public void removerItem(String nome) {
        Item itemParaRemover = null;

        for (Item item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover = item;
                break;
            }
        }

        if (itemParaRemover != null) {
            itens.remove(itemParaRemover);
            System.out.println("Item removido: " + itemParaRemover.getNome());
        } else {
            System.out.println("Item não encontrado no carrinho.");
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras lista = new CarrinhoDeCompras();
        lista.adicionarItem("Pão", 5.50, 10);
        lista.adicionarItem("Queijo", 10.29, 1);
        lista.adicionarItem("Peito de Peru", 17, 1);
        lista.adicionarItem("Ovos", 12, 30);
        lista.exibirItens();
        lista.removerItem("Ovos");
        lista.exibirItens();
        System.out.println("Valor total: " + lista.calcularValorTotal());
    }
}
