package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private final List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public void exibirPessoas() {
        for (Pessoa pessoa : listaPessoas) {
            System.out.println("Nome: " + pessoa.getNome()
            + "\nIdade: " + pessoa.getIdade() +
            " \nAltura: " + pessoa.getAltura()
            );
        }
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacao = new OrdenacaoPessoas();
        ordenacao.adicionarPessoa("Bruno", 27, 1.75);
        ordenacao.adicionarPessoa("Eulalio", 28, 1.80);
        ordenacao.adicionarPessoa("Lais", 30, 1.60);

        System.out.println(ordenacao.ordenarPorIdade());
        System.out.println(ordenacao.ordenarPorAltura());
        ordenacao.exibirPessoas();
    }
}
