package Hangman;

import java.util.Scanner;

public class hangman {

    static final Scanner scanner = new Scanner(System.in);

    static void main(String[] ignoredArgs) {
        String word;

        System.out.println("HANGMAN");
        System.out.print("Guess the word:>");
        word = scanner.next();

        validateAnswer(word);
    }

    public static void validateAnswer(String word_to_validate) {
        if(word_to_validate.contains("java")) {
            System.out.println("You survived!");
        } else { System.out.println("You lost!"); }
    }

}
