package MAY11;

import java.util.Arrays;

public class MinimizeTheDifferent {
	public static void different(int [] arr, int k ) {
		Arrays.sort(arr);
		int tempmin=arr[0];
		int tempmax = arr[arr.length-1];
		int maxDiff = arr[arr.length-1]-arr[0];
		for(int i =1; i<arr.length; i++) {
			if(arr[i]-k<0) continue;
			tempmin = Math.min(arr[0]+k, arr[i]-k);
			tempmax = Math.max(arr[arr.length-1]-k, arr[i-1]+k);
			maxDiff = Math.min(maxDiff,tempmax-tempmin);
		}
		System.out.print(maxDiff);
	}
	public static void main(String [] args) {
		int [] arr = {7,4,8,8,8,9};
		int k =6;
		MinimizeTheDifferent.different(arr,k);
	}
}
