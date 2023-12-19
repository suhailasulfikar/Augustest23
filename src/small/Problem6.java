package small;
public class Problem6 {
public static void main(String[] args) {
		 int number = 29; 
	        boolean Prime = Prime(number);

	        if (Prime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }
public static boolean Prime(int num) {
 if (num <= 1) {// num=29  29<=1
return false; // Numbers less than or equal to 1 are not prime
	   }
 for (int i = 2; i <= Math.sqrt(num); i++) { //i=2; i<=29
if (num % i == 0) {//29%2==0
  return false; // If the number is divisible by any integer from 2 to the square root of the number, it's not prime.
	 }
	 }
     return true; // If no divisors are found, the number is prime.
	  }
	
}


