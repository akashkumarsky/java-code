package array;

import java.util.Arrays;

public class KthSmallestNo {
	static int kSmallest(int []arr, int k) {
		int size = arr.length;
		Arrays.sort(arr);
		int num =0;
		
		for(int i =0; i<k; i++) {
			 num = arr[i];
		}
		
		return num;
	}
	public static void main(String[] args) {
		int[] arr = { -12,111, -1, 2, 2, 3, 4, -11, 5, 6, 1,-223, 1, 8 };
		int k =15;
		if(kSmallest(arr,k)==0) {
			System.out.println("pleace choose valid value 1 to length-1");
		}else
		System.out.println(kSmallest(arr,k));
		
	}
}
