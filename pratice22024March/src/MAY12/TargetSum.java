package MAY12;

public class TargetSum {
	public static void target(int [] arr, int target) {
		int size = arr.length;
		for(int i=0; i<size-1; i++) {
			for(int j= i+1;j<size; j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(i+", "+j);
				}
			}
		}
	}
	public static void main(String [] args) {
		int [] arr = {1,3,4,53,21};
		int target = 7;
		TargetSum.target(arr,target);
	}
}
