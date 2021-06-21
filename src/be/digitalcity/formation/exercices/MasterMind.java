package be.digitalcity.formation.exercices;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MasterMind {
    public static void main(String[] args) {
        // Secret combination
        String[] combination = new String[4];
        System.out.println("Player One you can enter the secret combination :");
        secretCombination(combination);
        List<String> combinationArray = Arrays.asList(combination);

        // Try of the player
        String[] tries = new String[4];
        int nbTries = 0;
        boolean found;
        do {
            found = trialPlayer(combinationArray, tries);
            nbTries ++;
        } while (!found && nbTries <= 12);

        if (found){
            System.out.println("Well done you!");
        } else {
            System.out.println("Too bad, well try again you'll do better next time!");
        }
    }

    public static void secretCombination(String[] combination){
        Scanner scan = new Scanner(System.in);
        System.out.println("You can choose between 4 colors :\nG: Green\nR: Red\nB: Blue\nY: Yellow\nPlease enter you combination");

        for (int i = 0; i < combination.length; i++) {
            System.out.println("Write the n°" + (i+1) + " color :");
            combination[i] = scan.nextLine();
        }

        System.out.println(Arrays.toString(combination));
    }

    public static boolean trialPlayer(List<String> combination, String[] tries){
        boolean found = false;
        int foundWhite = 0, foundRed = 0;

        System.out.println("Player Two enter your trial :");
        secretCombination(tries);

        // Finding if it's the right color in the right place
        for (int i = 0; i < combination.size(); i++) {
            if (combination.get(i).equals(tries[i])){
                foundRed ++;
            } else if (combination.contains(tries[i])){
                foundWhite ++;
            }
        }

        // Print the resultat and check if the combination is found
        if (foundRed != 0){
            System.out.println("You've found " + foundRed + " good color(s) and at the right place !");
        }
        if (foundWhite != 0){
            System.out.println("You've found " + foundWhite + " good color(s) but not at the right place !");
        }
        if (foundRed == combination.size()){
            found = true;
        }
        return found;
    }
}
