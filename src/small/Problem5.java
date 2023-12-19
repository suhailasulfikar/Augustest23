package small;
//program to print fibonacci series
public class Problem5 {
public static void main(String[] args) {
		 int n = 10; // Change this to the number of Fibonacci terms you want
	        generateFibonacci(n);
	    }

	    public static void generateFibonacci(int n) {
	        int first = 0;
	        int second = 1;
	        

	        System.out.println("Fibonacci Series up to " + n + " terms:");
	        
	        for (int i = 0; i < n; i++) {
	            System.out.print(first + " ");
	            int next = first + second;
	            first = second;
	            second = next;
	        }
	    }
	
	}


