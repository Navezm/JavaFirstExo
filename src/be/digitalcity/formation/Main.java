package be.digitalcity.formation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");

        Scanner scan = new Scanner(System.in); // Permet de pouvoir scanner les informations qu'on va rentrer dans la console
        String message = scan.nextLine(); // Stockage des infos qu'on a rentré dans une variable

        System.out.println(message);

        byte joli = 6;
        String a = String.valueOf(joli);

        System.out.println(joli);
        System.out.println(a);

        /*
            Conversion
         */

        String test = "234";
        int i = Integer.parseInt(test);
        System.out.println(++i);
    }
}
