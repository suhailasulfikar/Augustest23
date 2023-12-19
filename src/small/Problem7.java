package small;
//program to find largest no in array

public class Problem7 {

	public static void main(String[] args) {
		int[] numbers = {4, 7, 2, 9, 1, 10, 6}; // 
        int max = findLargestNumber(numbers);
        System.out.println("The largest number in the array is: " + max);
    }

    public static int findLargestNumber(int[] arr) {
        int max = arr[0]; //   arr[4] ,arr[7] arr[9]

        for (int i = 1; i < arr.length; i++) {// i=1 ;1<7; arr[7] ;i++, 1=2; 2<7;i++, 1=3 ; 3<7;i++,i=4
            if (arr[i] > max) { //arr[1] > arr[0] , arr[2]>arr[1] , arr[3]>arr[1], arr[]
                max = arr[i]; //max= arr[1] , max=arr[3], max=arr[5]
            }
        }

        return max; 
    }
}
