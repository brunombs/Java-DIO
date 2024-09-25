public class Jogo {
    public static void main(String[] args) {
        JogoDigital jogodigital = new JogoDigital();
        JogoFisico jogofisico = new JogoFisico();

        jogodigital.setGenero("Terror");
        jogodigital.setPreco(100.49);
        jogodigital.setTitulo("Jogos Mortais");
        jogodigital.setTamanhoDownload(4.5);

        jogofisico.setGenero("Corrida");
        jogofisico.setPreco(150.99);
        jogofisico.setTitulo("Corridas Mortais");
        jogofisico.setPeso(132.20);

        System.out.println(jogodigital.getTitulo() + " é do gênero " + jogodigital.getGenero() + " e custa R$" + jogodigital.getPreco() + " e pesa " + jogodigital.getTamanhoDownload() + "GB");
        System.out.println(jogofisico.getTitulo() + " é do gênero " + jogofisico.getGenero() + " e custa R$" + jogofisico.getPreco() + " e pesa " + jogofisico.getPeso() + "gr");
    }
}
