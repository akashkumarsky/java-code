package MAY12;

public class kadanesAlog {
	public static void sumArray(int [] arr) {
		int currsum =0;
		int currmax =0;
		int i =0;
		int size =arr.length;
		while(i<size) {
			currsum+=arr[i++];
			if(currsum>currmax) {
				currmax = currsum;
			}
			if(currsum<0) {
				currsum =0;
			}
		}
		System.out.print(currmax);
	}
	public static void main(String [] args) {
		int [] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		kadanesAlog.sumArray(arr);
	}
}
