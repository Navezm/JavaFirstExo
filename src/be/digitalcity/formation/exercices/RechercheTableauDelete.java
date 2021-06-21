package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class RechercheTableauDelete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] tab = {1, 8, 4, 19, 48, 758};
        boolean flag = false, del = false;
        int indiceValeur = 0, valeurCherchee;

        System.out.println("Entrez la valeur recherchée que vous voulez supprimer :");
        valeurCherchee = scan.nextInt();

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeurCherchee){
                indiceValeur = i;
                flag = true;
            }
        }

        if (flag){
            System.out.println("La valeur recherchée se trouvait à l'indice :" + indiceValeur);
            int[] temp = new int[tab.length-1];
            for (int i = 0; i < tab.length; i++) {
                if (i == indiceValeur){
                    del = true;
                } else {
                    if (del){
                        temp[i-1] = tab[i];
                    } else {
                        temp[i] = tab[i];
                    }
                }
            }
            tab = temp;
            System.out.println("Le nouveau tableau est :");
            for (int i = 0; i < tab.length; i++) {
                System.out.println(tab[i]);
            }
        } else {
            System.out.println("La valeur n'est pas présente dans le tableau");
        }
    }
}
