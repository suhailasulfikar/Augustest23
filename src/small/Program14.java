package small;
import java.util.Scanner;
public class Program14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
      scanner.close();
    }
   public static boolean isArmstrongNumber(int num) {
        int originalNumber = num;
        int numberOfDigits = (int) Math.log10(num) + 1;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }
  return sum == originalNumber;
    }
}
