package javaArrayMatrix;

public class Q4Max1sfind {

	static int rowWithMath1s(int mat[][], int R, int C) {
		boolean istrue = false;
		int mostcount = 0;
		int i_row = -1;
		for (int i = 0; i < R; i++) {
			int count = 0;
			for (int j = 0; j < C; j++) {
				if (mat[i][j] == 1) {
					count++;
					istrue = true;
				}
			}
			if (count > mostcount) {
				mostcount = count;
				i_row = i;
			}
		}

		if (!istrue)
			return -1;
		return i_row;
	}

	public static void main(String[] args) {
		int mat[][] = { { 0, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 0, 0 } };
		int R = 4;
		int C = 4;
		System.out.print("Index of row with maximum 1s is " + rowWithMath1s(mat, R, C));
	}

}
