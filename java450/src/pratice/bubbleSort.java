package pratice;

public class bubbleSort {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 45, 66, 656, 76, 2, 4, 6 };
		int[] ans = bubble(a);
		for (int i : ans) {
			System.out.print(i + ",");
		}

	}

	private static int[] bubble(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}

		}
		return a;

	}
}
