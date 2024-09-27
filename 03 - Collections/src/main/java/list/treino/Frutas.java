package main.java.list.treino;

import java.util.ArrayList;

public class Frutas {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Banana");
        frutas.add("Maçã");
        frutas.add("Morango");
        frutas.add("Abacaxi");
        frutas.add("Uva");
        System.out.println("Lista inicial com todas as frutas: " + frutas);
        frutas.removeLast();
        System.out.println("Lista com todas as frutas, exceto a última da lista anterior: " + frutas);
        frutas.remove("Morango");
        System.out.println("Lista inicial com exceção de duas frutas: " + frutas);
    }
}
