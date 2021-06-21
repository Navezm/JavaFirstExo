package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class InsererNewValeurTableauTrie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int newValeur;
        int[] tab = {1, 4, 8, 19, 48, 758};
        boolean flag = false;

        System.out.println("Entrez la nouvelle valeur à insérer :");
        newValeur = scan.nextInt();

        int[] temp = new int[tab.length+1];
        for (int i = 0; i < tab.length; i++) {
            if (newValeur < tab[i] && !flag){
                temp[i] = newValeur;
                flag = true;
            } else {
                if (flag){
                    temp[i] = tab[i-1];
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
    }
}
