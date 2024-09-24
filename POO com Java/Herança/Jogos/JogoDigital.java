public class JogoDigital {
    String titulo;
    String genero;
    double preco;
    double tamanhoDownload;

    public double getPreco() {
        return preco;
    }

    public double getTamanhoDownload() {
        return tamanhoDownload;
    }

    public String getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTamanhoDownload(double tamanhoDownload) {
        this.tamanhoDownload = tamanhoDownload;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
