package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class AnneeBissextile {
    public static void main(String[] args) {
        System.out.println("Entrez une année :");
        Scanner scan = new Scanner(System.in);
        int annee = scan.nextInt();

        if ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0 ){
            System.out.println("L'année est bissextile");
        } else {
            System.out.println("L'année n'est pas bissextile");
        }
    }
}
