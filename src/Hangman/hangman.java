package Hangman;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class hangman {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] ignoredArgs) {
        String[] words_to_guess = {"python", "java", "kotlin", "javascript"};
        String word_to_guess = words_to_guess[(int)(Math.random() * 4)];
        String hint = create_tip(word_to_guess);
        Set<Character> guessed_letters = new HashSet<>();
        int attempts = 8;

        System.out.println("HANGMAN");

        while (attempts > 0 && !hint.equals(word_to_guess)) {
            System.out.println();
            System.out.println(hint);
            System.out.print("Input a letter: ");
            String input = scanner.nextLine();

            if (input.length() != 1) {
                System.out.println("You should input a single letter.");
                continue;
            }

            char letter = input.charAt(0);

            if (letter < 'a' || letter > 'z') {
                System.out.println("Please enter a lowercase English letter.");
                continue;
            }

            if (guessed_letters.contains(letter)) {
                System.out.println("You've already guessed this letter.");
                continue;
            }

            guessed_letters.add(letter);

            if (word_to_guess.indexOf(letter) == -1) {
                System.out.println("That letter doesn't appear in the word.");
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
