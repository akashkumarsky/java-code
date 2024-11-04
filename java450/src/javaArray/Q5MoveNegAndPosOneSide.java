package javaArray;

public class Q5MoveNegAndPosOneSide {
	static void moveOneSide(int[] arr) {
		int[] newarr = new int[arr.length];
		int j = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] >= 0) {
				newarr[j++] = arr[i];
			}
			if (j == arr.length || j == 0) {
				return;
			}

		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				newarr[j++] = arr[i];
			}
		}

		for (int i : newarr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { -3, -5, -3, -45, -53, -1 };
		moveOneSide(arr);
	}
}
