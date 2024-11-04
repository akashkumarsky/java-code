package javaArray;
// Reverse the array

public class Q1Reverse_The_Array {
	static void bruteForceRevise(int[] arr) {
		int size = arr.length;
		int[] newarr = new int[size];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			newarr[j++] = arr[i];
		}
		System.out.print("[");
		for (int i : newarr) {
			System.out.print(i + ", ");

		}
		System.out.print("]");
	}

	static void optimiseReverse(int[] arr) {

		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
		System.out.print("[");
		for (int i : arr) {
			System.out.print(i + ", ");
		}
		System.out.print("]");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 3, 5, 2, 6 };

		bruteForceRevise(arr);
		System.out.println();
		optimiseReverse(arr);
		System.out.println();
	}

}
