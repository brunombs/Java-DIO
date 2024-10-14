public class CalculadoraPolimorfismo {
    public static void main(String[] args) {
        OperacaoMatematica operacao1 = new Soma();
        OperacaoMatematica operacao2 = new Multiplicacao();
        double num1 = 5.45;
        double num2 = 4.72;

        System.out.println("A soma de " + num1 + " + " + num2 + " é igual a: " + operacao1.calcular(num1, num2));
        System.out.println("A multiplicação de " + num1 + " + " + num2 + " é igual a: " + operacao2.calcular(num1, num2));
    }
}
