package small;
//program to sort array in ascending orders

import java.util.Arrays;
public class Problem9 {

	public static void main(String[] args) {
		int[] numbers = {5, 2, 9, 1, 5, 6, 3}; // Change this to your array of numbers
        Arrays.sort(numbers);
	
        System.out.println("Sorted Array in Ascending Order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}