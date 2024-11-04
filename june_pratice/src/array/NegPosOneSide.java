package array;

public class NegPosOneSide {
	static void saparate(int[] arr) {

		int high = arr.length;
		int[] arr1 = new int[high];
		int j = 0;
		for (int i = 0; i < high; i++) {
			if (arr[i] < 0) {
				arr1[j++] = arr[i];
			}
		}
		for (int i = 0; i < high; i++) {
			if (arr[i] > 0) {
				arr1[j++] = arr[i];
			}
		}

		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -1, 43, -53, 34, 23, 6, 57, -77, -4 };
		saparate(arr);

	}

}
