package Hangman;

import java.util.Scanner;

public class hangman {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] ignoredArgs) {
        String[] words_to_guess = {"python", "java", "kotlin", "javascript"};
        String word_to_guess = words_to_guess[(int)(Math.random() * 4)];
        String hint = create_tip(word_to_guess);
        int attempts = 8;

        System.out.println("HANGMAN");

        while (attempts > 0 && !hint.equals(word_to_guess)) {
            System.out.println();
            System.out.println(hint);
            System.out.print("Input a letter: ");
            char letter = scanner.next().trim().charAt(0);

            if (word_to_guess.indexOf(letter) == -1) {
                System.out.println("That letter doesn't appear in the word.");
                attempts--;
            } else if (hint.indexOf(letter) != -1) {
                System.out.println("No improvements.");
                attempts--;
            } else {
                hint = update_hint(hint, word_to_guess, letter);
            }
        }

        System.out.println();
        if (hint.equals(word_to_guess)) {
            System.out.println("You guessed the word " + word_to_guess + "!");
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }

    public static String update_hint(String current_hint, String word_to_guess, char letter) {
        char[] hint_chars = current_hint.toCharArray();
        for (int i = 0; i < word_to_guess.length(); i++) {
            if (word_to_guess.charAt(i) == letter) {
                hint_chars[i] = letter;
            }
        }
        return new String(hint_chars);
    }

    public static String create_tip(String word) {
        return "-".repeat(word.length());
    }

}
