package main.java.list.treino;

import java.util.ArrayList;

public class MarcasDeCarros {
    public static void main(String[] args) {
        // Criando uma lista de Strings
        ArrayList<String> marcas_de_carros = new ArrayList<>();

        // Adicionando elementos à lista
        marcas_de_carros.add("Nissan");
        marcas_de_carros.add("Toyota");
        marcas_de_carros.add("Hyundai");

        // Exibindo a lista
        System.out.println("Lista das marcas: " + marcas_de_carros);

        // Removendo um elemento
        marcas_de_carros.removeLast();

        // Exibindo a lista atualizada
        System.out.println("Após remoção: " + marcas_de_carros);
    }
}
