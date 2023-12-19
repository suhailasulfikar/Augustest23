package small;

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to display its multiplication table: ");
        int number = scanner.nextInt();
      printMultiplicationTable(number);
      scanner.close();
    }
 public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}