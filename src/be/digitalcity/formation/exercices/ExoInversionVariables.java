package be.digitalcity.formation.exercices;

public class ExoInversionVariables {
    public static void main(String[] args) {
        System.out.println("Inversion de variables");
        byte a = 5, b = 7, temp;

        System.out.println("A vaut " + a + " et B vaut " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("A vaut " + a + " et B vaut " + b);
        System.out.println("B vaut " + b);
    }
}
