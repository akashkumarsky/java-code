package serrchingsorting;


public class Q1first_and_last_positions {
	static void minAndMax(long [] arr , int target) {
		int first =-1; int last = -1;
		for(int i =0 ; i<arr.length; i++) {
			if(arr[i]==target) {
				if(first == -1) {
					first = i;
				}
				last =i;
			}
		}
		System.out.println("first element is "+first +" and last element is "+last);
	}
	public static void main(String [] args) {
		long [] arr = {34,34,34,36,75,436,1354};
		int target =35;
		minAndMax(arr,target);
	}
}
