package ChatBot;
import java.util.Scanner;

public class ChatBot {

    static  final Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        String bot_name = "Hero";
        String you_name;

        System.out.printf("\nHello, my name is %s!", bot_name);
        System.out.println("\nI was created in 2026");
        System.out.println("Please, remind me your name.");
        you_name = scanner.nextLine();
        System.out.printf("What a great name you have, %s", you_name);
    }
}
