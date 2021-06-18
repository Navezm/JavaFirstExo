package be.digitalcity.formation.exercices;

public class TriTableau {
    public static void main(String[] args) {
        int tab[] = {1, 24, 8, 74, 6, 12, 7451};
        int temp;
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] > tab[j]){
                    temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
