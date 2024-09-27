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

        System.out.println("Remova o nome de uma pessoa da lista: ");
        String remover = scanner.nextLine();
        nomes.remove(remover);
        System.out.println("A lista atualizada: " + nomes);

        System.out.println("Diga o nome da pessoa que você quer verificar se está ou não na lista: ");
        String nomeParaVerificar = scanner.nextLine();
        boolean estaNaLista = nomes.contains(nomeParaVerificar);
        System.out.println(nomeParaVerificar + " está na lista? " + estaNaLista);

        nomes.clear();
        System.out.println("A lista agora está vazia: " + nomes);
    }
}
