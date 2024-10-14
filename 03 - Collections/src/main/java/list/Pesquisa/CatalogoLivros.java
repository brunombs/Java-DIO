package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private final List<Livro> livros;

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

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2010);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2020);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2030);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2030);
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 3"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2009, 2025));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 3"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 2"));
    }
}
