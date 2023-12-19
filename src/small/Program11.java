package small;
import java.util.Scanner;
public class Program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();
         printPascalTriangle(numRows);
scanner.close();
    }
  public static void printPascalTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            int number = 1;
            for (int j = 0; j < numRows - i; j++) {
                System.out.print("   "); // Print spaces for formatting
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%6d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}