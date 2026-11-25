package Hangman;

import java.util.Scanner;

public class hangman {

    static final Scanner scanner = new Scanner(System.in);

    static void main(String[] ignoredArgs) {
        String[] words_to_guess = {"python", "java", "kotlin" , "javascript"};
        String word_to_guess = words_to_guess[(int)(Math.random() * 4)];
        String word;
        boolean is_game_running = true;

        System.out.println("HANGMAN");

        while(is_game_running) {
            System.out.print("Guess the word:>");
            word = scanner.next();

            is_game_running = validateAnswer(word, word_to_guess);
        }

    }

    public static boolean validateAnswer(String word_to_validate, String correct_answer) {
        if(word_to_validate.contains(correct_answer)) {
            System.out.println("You survived!");
            return false;
        } else {
            System.out.println("You lost!");
            return true;
        }
    }

}
