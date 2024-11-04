package pratice;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeOverlappingInterval {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 3 }, { 8, 10 }, { 2, 6 }, { 15, 18 } };
		int[][] ans = margeInterval(arr);
		for (int[] is : ans) {
			System.out.print(Arrays.toString(is));
		}
	}

	private static int[][] margeInterval(int[][] arr) {

		Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

		ArrayList<int[]> list = new ArrayList<int[]>();

		for (int[] i : arr) {
			if (list.size() == 0) {
				list.add(i);
			} else {
				int[] prev_IntervalOneIndx = list.get(list.size() - 1);
				if (i[0] < prev_IntervalOneIndx[1]) {
					prev_IntervalOneIndx[1] = Math.max(i[1], prev_IntervalOneIndx[1]);
				} else {
					list.add(i);
				}
			}
		}

		return list.toArray(new int[list.size()][]);

	}
}
