package small;
//program to reverse an array
public class Problem8 {
public static void main(String[] args) {
		 int[] originalArray = {1, 2, 3, 4, 5, 6};
	        reverseArray(originalArray);

	        System.out.println("Reversed Array:");
	        for (int i = 0; i < originalArray.length; i++) {
	         System.out.print(originalArray[i] + " ");
	        }
	    }
   public static void reverseArray(int[] arr) {
	        int start = 0;
	        int end = arr.length - 1;
	        while (start < end) {
	            // Swap the elements at start and end indices
	            int temp = arr[start];// t=1
	            arr[start] = arr[end]; //s=6
	            arr[end] = temp;//e=1

	            start++;
	            end--;
	        }
	    }
}
	    
	

	
