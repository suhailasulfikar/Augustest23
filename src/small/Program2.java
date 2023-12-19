package small;
// Program to check whether a number is factorial not?

public class Program2 {

	public static void main(String[] args) {
		int number = 5; 
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

 public static long calculateFactorial(int n) { //n=5
 long factorial = 1; //f=1
 for (int i = 1; i <= n; i++) { //i=1;1<=5; f=1 ;i++ , i=2;2<=5;f=1*2:i++, i=3;3<=5;f=6(1*2*3);i++ , i=4;4<=5;f(1*2*3*4)24;i++,
                               //i=5;5<=5;f=(12345)120;i++ ,i=6;6<=5 f
 //factorial=factorial*i;  => factorial*=i;
   factorial *= i;// f=f*i(1)  ,f=1*2 ,f=2*3,f=(1*2*3)6*4 ,f=(1*2*3*4)24*5
        }
        return factorial;
    }
}
 //5=1*2*3*4*5
