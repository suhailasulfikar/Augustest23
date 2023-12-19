package small;
//	Program to check whether a number is Palindrome or not?
public class Problem1 {
public static void main(String[] args) {
		int number = 123;

        if (palindrome(number)) 
        {
            System.out.println(number + " is a palindrome.");
        } else
        {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean palindrome(int num) {
        int realNum = num;
        int reverse = 0;
//num=123  
        while (num > 0) {//123>0 true ,12>0 true, 1>0 true,0>0 false
            int digit = num % 10; // 123%10=3  digit=3, 12%10=2 ,1%10=1
            reverse = reverse * 10 + digit; // r=r*10+digit  => r=0*10+3 r=3, 3=3*10+2  r=32 , 32=32*10+1 r=321
            num = num / 10; // num(123)=num(123)/10  num=12 ,num(12)=num(12)/10  num=1 ,1=1/10=0
        }

        return realNum == reverse;
    }
}

	


