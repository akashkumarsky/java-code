package pratice;

import java.util.Arrays;

public class dublicate1 {
	public static void removeDublicate(int[] arr) {
		Arrays.sort(arr);
		int size = arr.length;
		int j = 0;
		for (int i = 0; i < size; i++) {

			if (arr[i] != arr[j]) {

				j++;
				arr[j] = arr[i];
			}
		}
		for (int i = 0; i < j + 1; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String args[]) {
		int[] arr = { 3,3, 6, 6,62, 73,73,3 };
		removeDublicate(arr);

	}
}
