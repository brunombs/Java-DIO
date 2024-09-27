package main.java.list.Pesquisa;

import main.java.list.OperacoesBasicas.Item;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livros.isEmpty()) {
            for(Livro livro : livros) {
                if(livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos (int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!livros.isEmpty()) {
            for (Livro livro : livros) {
                if(livro.getAnoDePublicacao() >= anoInicial && livro.getAnoDePublicacao() <= anoFinal) {
                    livrosPorAno.add(livro);
                }
            }
        }
        return livrosPorAno;
    }

    public List<Livro> pesquisarPorTitulo(String titulo){
        List<Livro> livroPorTitulo = new ArrayList<>();
        if(!livros.isEmpty()) {
            for (Livro livro : livros) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo.add(livro);
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}
