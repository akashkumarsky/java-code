package array;

// Cyclically rotate by one
public class CyclicallyRotate {
	static void cycle(int[] arr) {
		int last = arr[arr.length - 1];
		int temp = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = last;
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 6 };
		cycle(arr);

	}

}
