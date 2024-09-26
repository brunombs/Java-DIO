import java.util.*;

public class Nomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        int cont = 0;

        while (cont < 5) {
            System.out.println("Digite o nome de uma pessoa para adicionar na nossa lista: ");
            String nome = scanner.nextLine();
            nomes.add(nome);
            cont++;
        }
        System.out.println("Os nomes na lista são: " + nomes);
    }
}
