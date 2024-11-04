package javaArray;

public class Q31MinimumNOof_OperationFor_Array_alindrome {
	static public int  minimum_No_Operation(int [] arr) {
		int ans =0;
		int i =0;
		int j = arr.length-1;
		while(i<=j) {
			if(arr[i]==arr[j]) {
				i++;
				j--;
			}else if(arr[i]>arr[j]) {
				ans++;
				j--;
				arr[j] = arr[j+1]+arr[j];
				
			}else  {
				ans++;
				i++;
				arr[i] =arr[i]+arr[i-1];
				
			}
		}
		return ans;
	}
	public static void main(String [] args ) {
		
		int [] arr = {9,4,5,3,1,4,5,4,9};
		System.out.print(minimum_No_Operation(arr)); 
		
	}
}
