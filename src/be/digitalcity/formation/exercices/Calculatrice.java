package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        System.out.println("Donne moi un nombre entier :");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Donne moi un opérateur (+,-,*,/) :");
        char operator = scan.next().charAt(0);
        System.out.println("Donne moi un autre nombre entier :");
        int b = scan.nextInt();

        switch (operator){
            case '+':
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
            case '/':
                if (b == 0){
                    System.out.println("L'opération est impossible");
                    break;
                } else {
                    System.out.println(a + " / " + b + " = " + (a/b));
                    break;
                }
            default:
                System.err.println("L'opérateur n'est pas correct");
                break;
        }
    }
}
