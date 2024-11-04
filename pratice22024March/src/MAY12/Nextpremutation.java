package MAY12;

public class Nextpremutation {
	public static void premutation(int [] arr) {
		int size = arr.length;
		int pivot_k = size-2;
		
		if(arr==null || size ==0) return;
		
		for(int i = size-1 ;i>0;i--) {
			if(arr[i]<=arr[i-1]) {
				pivot_k --;
			}else {
				break;
			}
		}
		
		if(pivot_k == -1) {
			reverse(arr,0,size-1);
			return;
		}
		for(int i = size-1; i>0;i--) {
			if(arr[i]>arr[pivot_k]) {
				int temp = arr[i];
				arr[i] = arr[pivot_k];
				arr[pivot_k] = temp;
				break;
			}
		}
		reverse(arr,pivot_k+1,size-1);
	}
	public static void reverse(int [] arr,int start ,int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public static void main(String [] args) {
		int [] arr = {4,5,1};
		Nextpremutation.premutation(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
}
