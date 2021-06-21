package be.digitalcity.formation;

public class MainFunctions {
    public static void main(String[] args) {
        int val = 5;
        val = m1(val); // Quand on passe la valeur dans une fonction on va faire une copie de notre variable et donc c'est pour ça que la valeur de val ne change pas
        System.out.println(val);

        m2(10,5);

        System.out.println(m3(10000000000D));

        System.out.println(moyenne(5, 6, 9, 26));
    }

   // public static void M1(int i){
   //     System.out.println(++i);
   // }

    public static int m1(int i){
        System.out.println(++i);
        return i;
    }

    public static int m1() {
        return 0;
    }

    public static int m1(double i) {
        return 0;
    }

    public static void m2(int a, int b){
        if (a == 0){
            return;
        }
        System.out.println(a+b);
    }

    public static int m3(double a) {
        return (int) a + 5;
    }

    public static double moyenne(int... cote) { // pour utiliser les "..." on ne peut pas en passer deux en paramètres & il doit toujours être déclaré en dernier
        var total = 0;
        for (int j : cote) {
            total += j;
        }
        return (double) total / cote.length;
    }
}
