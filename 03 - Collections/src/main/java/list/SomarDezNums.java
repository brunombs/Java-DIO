package main.java.list;

import java.util.ArrayList;
import java.util.Random;

public class SomarDezNums {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        int numeroAleatorio;
        int sum = 0;
        int cont = 0;

        while (cont < 10) {
            numeroAleatorio = new Random().nextInt(100) + 1;
            nums.add(numeroAleatorio);
            cont++;
        }

        for (int num: nums) {
            sum += num;
        }


        System.out.println("Os 10 números sorteados de forma aleatória foram: " + nums);
        System.out.println("A soma de todos os números é: " + sum);
    }
}
