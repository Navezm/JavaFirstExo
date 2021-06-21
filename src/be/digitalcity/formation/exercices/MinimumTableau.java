package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class MinimumTableau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        int indiceMin = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Entrez un nombre :");
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    indiceMin = i;
                }
            }
        }

        System.out.println("Le plus petit nombre du tableau est :" + array[indiceMin]);
    }
}
