package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class RepetitionsLigne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez le nombre de répétitions :");
        int nbRep = scan.nextInt();
        System.out.println("Entrez le nombre de tiret");
        int nbTiret = scan.nextInt();
        System.out.println("Entrez le nombre d'espace");
        int nbEspace = scan.nextInt();

        for (int i = 0; i < nbRep; i++) {
            for (int j = 0; j < nbTiret; j++) {
                System.out.print("-");
            }
            for (int k = 0; k < nbEspace; k++) {
                System.out.print(" ");
            }
        }
    }
}
