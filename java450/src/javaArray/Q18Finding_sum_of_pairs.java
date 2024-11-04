package javaArray;
//find all pairs on integer array whose sum is equal to given number

public class Q18Finding_sum_of_pairs {
	public static void allPairs(int[] arr, int size,int number) {
		for(int i =0;i<size;i++) {
			for(int j = i+1 ;j<size; j++) {
				if(arr[i]+arr[j]==number) {
					System.out.println("["+i+","+j+"]");
				}
			}
		}
	}
	public static void main(String [] args) {
		int[] arr = {15, 12, 4, 16, 9, 8, 24, 0};
		int size = arr.length;
		int number = 24;
		
		allPairs(arr, size, number);
				
	}

}
