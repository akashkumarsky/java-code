package javaArray;

public class Q15Next_permutation {
	public static void premutation(int [] arr) {
		int size = arr.length;
		int  pivot_k = size-2; // compare the last and secend last
		//cheak arr equal to null or size equal to 0;
		if(arr==null || size == 0) return;
	
		// find pivot_k in arr
		for(int i = size-2; i>0;i--) {
			if(arr[i]<=arr[i-1]) pivot_k--;
			else {
				break;
			}
		}
		//cheak pivot_k is -1 the reverse arr
		if(pivot_k ==-1) {
			reverse(arr,0,size-1);
			return;
		}
		
		//replace pivot_k with greatest element reverse
		for(int i = size-1;i>0; i--) {
			if(arr[i]>arr[pivot_k]) {
				int temp = arr[i];
				arr[i] = arr[pivot_k];
				arr[pivot_k] = temp;
				break;
			}
		}
		reverse(arr, pivot_k+1,size-1);
	}
	static void reverse(int [] arr, int start ,int end){
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] =temp;
			start++;
			end--;
		}
	}
	
	
	public static void main(String [] args) {
		int [] arr = {1,3,6};
		premutation(arr);
		for(int i : arr) {
			System.out.print(i+", ");
		}
		
	}
}
