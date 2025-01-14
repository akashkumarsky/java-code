package javaArrayMatrix;

public class Q2Search_an_element {
	static int search1(int[][] mat, int size, int target) {
		int row_size = size;
		int col_size = size;
		int low = 0;
		int high = row_size * col_size - 1;
		while (low < high) {
			int mid = (low + high) / 2;
			int row = mid / row_size;
			int col = mid % col_size;
			if (mat[row][col] == target) {
				System.out.print("Element found at index [" + row + ", " + col + "]");
				return 1;
			} else if (mat[row][col] < target) {
				low = mid + 1;
			} else
				high = mid - 1;

		}
		System.out.print("Element Not found!");
		return 0;
	}

	// brute force
	static int search(int[][] mat, int size, int target) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (mat[i][j] == target) {

					System.out.print("Element found at index [" + i + ", " + j + "]");
					return 1;
				}
			}
		}
		System.out.print("Element Not found!");
		return 0;
	}

	public static void main(String[] args) {
		int mat[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

		// Function call
		search(mat, 4, 35);
		System.out.println();
		search1(mat, 4, 35);

	}

}
