package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class LanceurBalle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nbBalles = 5;
        System.out.println("Es-tu prêt ?");
        boolean pret = scan.nextBoolean();
        System.out.println(pret);

        if (pret){
            while (nbBalles > 0){
                System.out.println("Lance une balle");
                nbBalles --;
            }
            System.out.println("Il n'y a plus de balles");
        } else {
            System.out.println("Revenez quand vous serez prêt");
        }
    }
}
