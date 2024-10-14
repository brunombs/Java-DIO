public class Animais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.setNome("Druid");
        gato.setNome("Nino");
        System.out.println(cachorro.getNome() + " latiu fazendo esse som: " + cachorro.fazerSom());
        System.out.println(gato.getNome() + " miou fazendo esse som: " + gato.fazerSom());
    }
}
