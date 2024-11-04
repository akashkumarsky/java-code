package javaArray;

import java.util.Arrays;

//Minimise the maximum difference between height
public class Q9Minimise_the_maximum_difference {
	public static int minimiseMaximum(int [] arr, int n, int k) {
		Arrays.sort(arr);
		
		int max_diff = arr[n-1]-arr[0];
		
		int tempMin =arr[0];
		int tempMax =arr[n-1];
		
		for(int i =0 ; i<n; i++) {
			
			//if on subtracting k we got negative then
            // continue
			if(arr[i]-k<0) continue;
			
			tempMin= Math.min(arr[0]+k, arr[i]-k);
			
			tempMax = Math.max(arr[n-1]-k, arr[i-1]+k);
			
			max_diff = Math.min(max_diff , tempMax-tempMin);
		}
		
		return max_diff;
	}
	public static void main(String[] args) {
		int[] arr = { 7, 4, 8, 8, 8, 9 };
		int k = 6;
		System.out.println(minimiseMaximum(arr,arr.length,k));
	}

}
