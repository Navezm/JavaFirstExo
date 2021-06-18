package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class DistriBoisson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte nbBoisonRestante = 10;
        String reponse;
        boolean continuer = false;

        do {
            System.out.printf("Quel sera ton choix dans ces boissons ? %n 1.Pepsi %n 2.fanta %n 3.Eau %n 4.Café %n 5.Thé %nEntrez le nombre de la boisson désirée :");
            String choix = scan.nextLine();
            switch (choix) {
                case "1" -> System.out.println("Voici ton Pepsi");
                case "2" -> System.out.println("Voici ton Fanta");
                case "3" -> System.out.println("Voici ton Eau");
                case "4" -> System.out.println("Voici ton Café");
                case "5" -> System.out.println("Voici ton Thé");
                default -> System.out.println("Ce choix n'existe pas");
            }
            nbBoisonRestante --;
            System.out.println("Veux-tu encore une boisson ? (O / N)");
            reponse = scan.nextLine();
            if (reponse.equals("O")){
                continuer = true;
            }
        } while(nbBoisonRestante != 0 && continuer);
        if (continuer){
            System.out.println("Il n'y a plus de boissons disponibles");
        } else {
            System.out.println("Revenez quand vous voulez !");
        }
    }
}
