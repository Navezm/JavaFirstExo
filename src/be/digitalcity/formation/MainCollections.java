package be.digitalcity.formation;

import java.util.*;

public class MainCollections {
    public static void main(String[] args) {
  //      tableauMultiDimensionnel();
  //      CollectionsListes();
        tableauAssociatifs();
    }

    private static void tableauAssociatifs() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Bonjour");
        map.put(2, "Hello");

        // Donne la clé + la valeur
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> "+ entry.getValue());
        }

        // Donne toutes les clés
        for (Integer key : map.keySet()){
            System.out.println(key);
        }

        // Donne toutes les valeurs
        for (String value : map.values()){
            System.out.println(value);
        }
    }

    private static void CollectionsListes() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        double val = 254.36;
        list.add((int) val);
        // list.set(2,26);
        list.add(list.indexOf(5), 63);
        list.forEach(x -> System.out.println(x));

        System.out.println(Collections.max(list));

        list.sort((x,y) -> (int) (x-y));
        list.forEach(x -> System.out.println(x));

        // L'interface set permet d'éviter les doublons car il ne les enregistre même pas
        HashSet<Integer> set = new HashSet<>();
        System.out.println(set.add(5));
        System.out.println(set.add(15));
        System.out.println(set.add(5));
        System.out.println(set.size());
        set.forEach(x -> System.out.println(x));

        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();


    }

    public static void tableauMultiDimensionnel() {
        int[][] tableau = new int[2][];
        tableau[0] = new int[] {1,2,3,4,5};
        tableau[1] = new int[] {6,7,8,9,10};
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print(tableau[i][j] + "\t");
            }
            System.out.println();
        }

        /* Autre manière d'écrire avec du foreach
            for (int[] ints : tableau) {
                for (int anInt : ints) {
                    System.out.print(anInt + "\t");
                }
                System.out.println();
            }
         */
    }
}
