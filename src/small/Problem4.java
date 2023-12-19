package small;
//program to count all vowels in string
public class Problem4 {
public static void main(String[] args) {
	String input = "Hello, World!"; 
        countVowels(input);
    }
    public static void countVowels(String str) {//str =Hello, World
        str = str.toLowerCase(); // Hello, World => hello, world (convertion takeplace)
        int count = 0;// c=0

        System.out.println("Vowels in the string:");

        for (int i = 0; i < str.length(); i++) {//i=0; 0<13 ;ch=0;i++
            char ch = str.charAt(i);//ch=0
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch);
                count++;
            }
        }

        System.out.println("Total vowels: " + count);
    }
}