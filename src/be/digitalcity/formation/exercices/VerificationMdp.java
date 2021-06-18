package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class VerificationMdp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mdpCorrect = "Cho";
        System.out.println("Entrez votre mot de passe :");
        String mdpSaisi = scan.nextLine();
        int i = 1;
        boolean flag = true;

        while (!mdpSaisi.equals(mdpCorrect) && i < 3){
            System.out.println("Le mot de passe est incorrect, essaie encore");
            mdpSaisi = scan.nextLine();
            if (mdpSaisi.equals(mdpCorrect)){
                flag = false;
            }
            i ++;
        }
        if (flag){
            System.out.println("Votre compte est bloqué vous n'avez plus d'essai");
        } else {
            System.out.println("Bravo tu peux te connecter");
        }
    }
}
