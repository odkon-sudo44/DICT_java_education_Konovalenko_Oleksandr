package ChatBot;
import java.util.Scanner;

public class ChatBot {

    static  final Scanner scanner = new Scanner(System.in);

    static void main(String[] ignoredArgs) {
        String bot_name = "Hero";
        String you_name;
        int remainder3;
        int remainder5;
        int remainder7;
        int age;
        int userInp;

        System.out.printf("\nHello, my name is %s!", bot_name);
        System.out.println("\nI was created in 2026");
        System.out.println("Please, remind me your name.");
        you_name = scanner.nextLine();
        System.out.printf("What a great name you have, %s\n", you_name);
        System.out.println("Let me guess your age.");
        System.out.println("Enter reminders of dividing your age by 3, 5 and 7.");
        remainder3 = scanner.nextInt();
        remainder5 = scanner.nextInt();
        remainder7 = scanner.nextInt();
        age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.printf("Your age is %d; that`s a good time to start programming!\n", age);
        System.out.println("Now I will prove to you that I can count to any number you want!");
        userInp = scanner.nextInt();

        for(int i = 0; i <= userInp; i++) {
            System.out.printf("%d !\n", i);
        }

    }
}
