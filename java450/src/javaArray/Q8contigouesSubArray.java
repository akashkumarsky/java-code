package javaArray;
//contigoues subArray sum (kaden's algo)
public class Q8contigouesSubArray {
	public static int subArray(int [] arr) {
		int current_sum= 0;
		int curr_max =0;
		for(int i = 0 ;i<arr.length; i++) {
			current_sum = current_sum+arr[i];
			if(current_sum>curr_max) {
				curr_max = current_sum;
			}
			if(current_sum<0) {
				current_sum =0;
			}
		}
		
		return curr_max;
	}
	public static void main(String[] args) {
		int [] arr = new int[] {-1,2,4,-2,5};
		System.out.println(subArray(arr));
		
	}

}
