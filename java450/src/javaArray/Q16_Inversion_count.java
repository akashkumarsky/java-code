package javaArray;

/*
 Given:

A = { 10 , 1 , 2 , 4 , 13 , 9 , 5 }

Output :

In the above example, you have to find the total number of inversions starting from the 0th index and upto the last index by comparing each value with another value.

And the number of inversions that are possible as follows: { ( 10 , 1 ) , ( 10 , 2 ) , ( 10 , 4 ) , ( 10 , 9 ) , ( 10 , 5 ) , ( 13 , 9 ) , ( 13 , 5 ) , ( 9 , 5 ) }

Total count of inversions are : 8

*/
public class Q16_Inversion_count {
	public static int inversionGetCount (int [] arr) {
		int count =0;
		int size = arr.length;
		for(int i = 0 ; i<size-1; i++) {
			for(int j =i+1; j<size; j++) {
				if(arr[i]>arr[j]) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String [] args) {
		int [] arr = {1, 20, 6, 4, 5};
		int output = inversionGetCount(arr);
		System.out.print(output);
	}
}
