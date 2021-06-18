package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class CompteurSecondes {
    public static void main(String[] args) {
        int jours, heures, min, sec;

        System.out.println("Entrez un nombre de secondes :");
        Scanner scan = new Scanner(System.in);
        long totalSec = scan.nextLong();

        jours = (int) totalSec / 86400;
        heures = (int) totalSec % 86400 / 3600;
        min = (int) totalSec % 86400 % 3600 / 60;
        sec = (int) totalSec % 86400 % 3600 % 60;
        System.out.println("La traduction de " + totalSec + " secondes vaut "
                + jours + " jours "
                + heures + " heures "
                + min + " minutes "
                + sec + " secondes");

    }
}
