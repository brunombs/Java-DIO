public class Guitarra extends InstrumentoMusical {
    @Override
    void tocar() {
        System.out.println("Tocando guitarra");
    }

    @Override
    void afinar() {
        System.out.println("Afinando a guitarra");
    }
}
