package pratice;

public class kadensAlgo {

	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int ans = longestsubArray(arr);
		System.out.println(ans);
	}

	private static int longestsubArray(int[] arr) {
		int currMax = 0;
		int currSum = 0;

		for (var i : arr) {
			currSum += i;
			if (currSum > currMax) {
				currMax = currSum;
			}
			if (currSum < 0) {
				currSum = 0;
			}
		}
		return currMax;
	}
}
