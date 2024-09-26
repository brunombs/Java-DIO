import java.util.*;

public class Nomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        int cont = 0;
        System.out.println("Nossa lista vai conter o nome de 5 pessoas.");
        while (cont < 5) {
            cont++;
            System.out.println("Digite o nome da " + cont + "ª pessoa para adicionar na nossa lista: ");
            String nome = scanner.nextLine();
            nomes.add(nome);
        }
        System.out.println("Os nomes na lista são: " + nomes);
    }
}
