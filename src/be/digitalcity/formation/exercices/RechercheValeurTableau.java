package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class RechercheValeurTableau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] tab = {1, 8, 4, 19, 48, 758};
        boolean flag = false;
        int indiceValeur = 0, valeurCherchee;

        System.out.println("Entrez la valeur recherchée :");
        valeurCherchee = scan.nextInt();

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeurCherchee){
                indiceValeur = i;
                flag = true;
            }
        }

        if (flag){
            System.out.println("La valeur recherchée se trouve à l'indice :" + indiceValeur);
        } else {
            System.out.println("La valeur n'est pas présente dans le tableau");
        }
    }
}
