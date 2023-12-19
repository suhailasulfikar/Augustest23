package small;

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        if (isAlphabet(character)) {
            System.out.println(character + " is an alphabet.");
        } else {
            System.out.println(character + " is not an alphabet.");
        }

        scanner.close();
    }

    public static boolean isAlphabet(char c) {
        // Check if the character is an uppercase letter (A-Z) or a lowercase letter (a-z)
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}