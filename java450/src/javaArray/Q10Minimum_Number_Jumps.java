package javaArray;

public class Q10Minimum_Number_Jumps {

	public static int numberOfJump(int[] arr) {
		int total_jumps = 0;
		int destination = arr.length - 1;
		int last_jumpIdx = 0;
		int coverage = 0;

		if (arr.length == 1)
			return 0;

		for (int i = 0; i < arr.length; i++) {
			coverage = Math.max(coverage, i + arr[i]);

			if (i == last_jumpIdx) {
				last_jumpIdx = coverage;
				total_jumps++;
				if (coverage >= destination) {
					return total_jumps;
				}

			}

		}
		return total_jumps;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 1, 4 };
		int ans = numberOfJump(arr);
		System.out.println(ans);
	}

}
