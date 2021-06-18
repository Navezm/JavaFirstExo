package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class DistriBoisson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte nbBoisonRestante = 10;
        boolean continuer = true;

        do {
            System.out.printf("Quel sera ton choix dans ces boissons ? %n 1.Pepsi %n 2.fanta %n 3.Eau %n 4.Café %n 5.Thé %nEntrez le nombre de la boisson désirée :");
            String choix = scan.nextLine();
            switch (choix){
                case "1":
                    System.out.println("Voici ton Pepsi");
                    break;
                case "2":
                    System.out.println("Voici ton Fanta");
                    break;
                    
                case "3":
                    System.out.println("Voici ton Eau");
                    break;
                case "4":
                    System.out.println("Voici ton Café");
                    break;
                case "5":
                    System.out.println("Voici ton Thé");
                    break;
                default:
                    System.out.println("Ce choix n'existe pas");
            }
            nbBoisonRestante --;
            System.out.println("Veux-tu encore ");
        } while(nbBoisonRestante != 0 && continuer);
        System.out.println("Il n'y a plus de boissons disponibles");
    }
}
