package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class BougerPion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tab = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int pion = 0;
        boolean stop = false;
        String direction;

        while(!stop){
            System.out.println("Par où veux-tu aller ? (g = gauche, d = droite, q = stop)");
            direction = scan.nextLine();
            if (pion != 9 && direction.equals("d")){
                tab[pion] = 0;
                pion ++;
                tab[pion] = 1;
            } else if (pion != 0 && direction.equals("g")){
                tab[pion] = 0;
                pion --;
                tab[pion] = 1;
            } else if (direction.equals("q")){
                stop = true;
            } else {
                System.out.println("Ce mouvement n'est pas possible");
            }
            System.out.println("Ton pion se trouve en position :" + (pion + 1));
        }
        System.out.println("A bientot pour une nouvelle partie !");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
