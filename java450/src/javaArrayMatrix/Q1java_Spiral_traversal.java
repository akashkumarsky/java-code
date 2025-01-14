package javaArrayMatrix;

import java.util.ArrayList;
import java.util.List;

public class Q1java_Spiral_traversal {
	static List<Integer> spiralOrder(int arr[][]) {
		int size1 = arr.length;
		int size2 = arr[0].length;
		int top = 0;
		int left = 0;
		int bottom = size1 - 1;
		int right = size2 - 1;
		List<Integer> ans = new ArrayList<>();

		while (left <= right && top <= bottom) {
			for (int i = left; i <= right; i++) {
				ans.add(arr[top][i]);
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				ans.add(arr[i][right]);
			}
			right--;
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					ans.add(arr[bottom][i]);
				}
				bottom--;
			}
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					ans.add(arr[i][left]);
				}
				left++;
			}
		}
		return ans;

	}

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4, 5 }, { 56, 7, 8, 3, 4 }, { 6, 34, 3, 21, 45 } };

		// Function call

		System.out.print(spiralOrder(arr));

	}

}
