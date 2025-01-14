package javaArray;

public class Q30Minimum_swaps_required {
	static int minSwap(int[] arr, int n, int k) {
		int goodCount = 0;// slidingwindow or find the no <= k;
		int badCount = 0; // No > k;
		for (int i = 0; i < n; i++)
			if (arr[i] <= k) goodCount++;
				

		for (int i = 0; i < goodCount; i++)
			if (arr[i] > k)badCount++;
				

		int i = 0, j = goodCount, ans = badCount;
		
		while (j < n) {
			if (arr[i] > k)badCount--; // if the start element > k
				
			if (arr[j] > k)badCount++; // window end next >k
				
			ans = Math.min(ans, badCount);
			i++;
			j++;
		}
		return ans;
	}

	public static void main(String[] args) {

		int arr[] = { 2, 1, 5, 6, 3 };
		int n = arr.length;
		int k = 3;
		System.out.print(minSwap(arr, n, k) + "\n");

		int arr1[] = { 2, 7, 9, 5, 8, 7, 4 };
		n = arr1.length;
		k = 5;
		System.out.print(minSwap(arr1, n, k));

	}

}
