package MAY12;

public class InversionCount {
	public static void inversion(int[] arr) {
		int size = arr.length;
		int count = 0;
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[i + 1]) {
					count++;
				}
			}
		}
		System.out.print(count);
	}

	public static void main(String[] args) {
		int[] arr = { 8, 4, 2, 1 };
		InversionCount.inversion(arr);
	}
}
