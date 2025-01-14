package javaArray;

import java.util.ArrayList;

public class Q20_Rerrange_Array_Element_by_sign {
	public static int [] RearrangebySign(int []arr,int size ) {
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		
		for(int i =0;i<size;i++) {
			if(arr[i]>0) pos.add(arr[i]);
			else neg.add(arr[i]);
		}
		
		for(int i = 0 ; i<size/2; i++) {
			arr[i*2]=pos.get(i);
			arr[i*2+1]=neg.get(i);
		}
		return arr;
	}
	public static void main(String args[]) {
		// Array Initialisation.
		
		int A[] = { 1, 2, -4, -5 };
		int size = A.length;

		int[] ans = RearrangebySign(A, size);

		for (int i = 0; i < size; i++) {
			System.out.print(ans[i] + " ");
		}

	}
}
