package be.digitalcity.formation.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Bulletin {
    public static void main(String[] args) {
        remplirNotes();
    }

    private static void remplirNotes() {
        HashMap<String, ArrayList> bulletin = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        int nbCours = 4;
        double total = 0;

        do {
            System.out.println("Entrez le nom de l'étudiant :");
            String nom = scan.nextLine();

            // Entrer toutes les notes
            ArrayList<Integer> tab = new ArrayList<>();
            for (int i = 0; i < nbCours; i++) {
                System.out.println("Entrez la note n°"+ (i+1) +" :");
                tab.add(scan.nextInt());
            }

            // Ajout dans le Hashmap
            bulletin.put(nom, tab);
            System.out.println(bulletin);

            System.out.println("Veux tu encoder pour un autre étudiant ?");
            flag = scan.nextBoolean();
            scan.nextLine();
        } while(flag);

        bulletin.forEach((x, y) -> System.out.println(x + " a obtenu : "+ y + " \nAvec une moyenne de : " + ));
    }
}
