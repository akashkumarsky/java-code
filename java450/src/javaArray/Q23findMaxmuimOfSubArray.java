package javaArray;

public class Q23findMaxmuimOfSubArray {

	//Brute Force Approach
	static int max(int[] arr) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int product = 1;
				for (int k = i; k <= j; k++) {
					product *= arr[k];
				}
				ans = Math.max(ans, product);
			}
		}
		return ans;
	}

	// optimize solution space -O(n) time - O(1)
	static int findMaxSubArray(int[] arr) {
		int pref = 1;
		int suff = 1;
		int ans = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (pref == 0)
				pref = 1;
			if (suff == 0)
				suff = 1;

			pref *= arr[i];
			suff *= arr[arr.length - i - 1];
			ans = Math.max(ans, Math.max(pref, suff));
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, -3, 0, -4, -5 };
		// int answer = findMaxSubArray(arr);
		int answer = max(arr);
		System.out.println("The maximum product subarray is: " + answer);
	}

}
