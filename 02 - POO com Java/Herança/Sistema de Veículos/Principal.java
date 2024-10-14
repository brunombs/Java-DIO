public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.setAno(2004);
        carro.setNumeroDePortas(4);
        carro.setMarca("Honda");

        moto.setAno(2024);
        moto.setCilindradas(150);
        moto.setMarca("Yamaha");

        System.out.println("O carro é da marca " + carro.getMarca() + " e foi fabricado no ano " + carro.getAno()
        + " e tem " + carro.getNumeroDePortas() + " portas.");

        System.out.println("A moto é da marca " + moto.getMarca() + " e foi fabricado no ano " + moto.getAno()
        + " e tem " + moto.getCilindradas() + " cilindradas.");
    }
}
