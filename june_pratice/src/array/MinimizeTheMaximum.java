package array;

import java.util.Arrays;

public class MinimizeTheMaximum {
	static void diff(int[] arr, int k) {
		Arrays.sort(arr);
		int size = arr.length;
		int deff = arr[size - 1] - arr[0];
		int smallest = arr[0];
		int highest = arr[size - 1];
		for (int i = 1; i < size; i++) {
			smallest = Math.min(arr[0] + k, arr[i] - k);
			highest = Math.max(arr[size - 1] - k, arr[i - 1] + k);
			deff = Math.min(deff, highest - smallest);
		}
		System.out.print(deff);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 8, 10 };
		int k = 2;
		diff(arr, k);

	}

}
