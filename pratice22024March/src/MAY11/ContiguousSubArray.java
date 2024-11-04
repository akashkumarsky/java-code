package MAY11;

public class ContiguousSubArray {
	public static void largstSubArraySum(int [] arr) {
		int curr_sum=0;
		int curr_max =0;
		int i =0;
		while(i<arr.length) {
			curr_sum+=arr[i];
			if(curr_sum>curr_max) {
				curr_max =curr_sum;
			}
			if(curr_sum<0) {
				curr_sum =0;
			}
			i++;
		}
		System.out.print(curr_max);
	}
	public static void main(String [] args) {
		int [] arr = {-1,2,4,-2,5};
		ContiguousSubArray.largstSubArraySum(arr);
			
	}
}
