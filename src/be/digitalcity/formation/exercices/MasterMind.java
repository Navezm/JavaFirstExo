package be.digitalcity.formation.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class MasterMind {
    public static void main(String[] args) {
        String[] combination = new String[4];
        secretCombination(combination);
    }

    public static void secretCombination(String[] combination){
        Scanner scan = new Scanner(System.in);
        System.out.println("You can choose between 4 colors :\nG: Green\nR: Red\nB: Blue\nY: Yellow\nPlease enter you combination :");
        for (int i = 0; i < combination.length; i++) {
            System.out.println("Write the n°" + (i+1) + " color :");
            combination[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(combination));
    }
}
