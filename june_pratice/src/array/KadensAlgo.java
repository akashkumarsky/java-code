package array;

public class KadensAlgo {
	static int kadens(int[] arr) {
		int current_sum =0;
		int current_max =0;
		for(int i =0;i<arr.length;i++) {
			current_sum = current_sum+arr[i];
			if(current_sum>current_max) {
				current_max = current_sum;
			}
			if(current_sum<0) {
				current_sum=0;
			}
		}
		return current_max;
	}
public static void main(String[] args) {
	int [] arr = {-1,2,4,-2,15,-4,};
	System.out.println(kadens(arr));
}
}
