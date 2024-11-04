package pratice;

public class SecandMax {
	public static void main(String[] args) {
		int[] arr = { 1349, 5, 6, 1, 45, 671, 6 };
		System.out.println(secMax(arr));
	}

	private static int secMax(int[] arr) {

		int size = arr.length;
		int firstMax = 0;
		int secandMax = 0;

		for (int i = 0; i < size; i++) {

			if (arr[i] > firstMax) {
				secandMax = firstMax;
				firstMax = arr[i];

			} else if (arr[i] < firstMax && arr[i] > secandMax) {
				secandMax = arr[i];
			}

		}
		return secandMax;

	}

}
