public class Instrumentos {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra();
        Piano piano = new Piano();

        guitarra.tocar();
        guitarra.afinar();

        piano.tocar();
        piano.afinar();
    }
}
