package pratice;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 23, 53, 6, 2, 1, 64 };

		int end = arr.length - 1;
		isMergeSort(arr, 0, end);
		printArray(arr);
	}

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	private static void isMergeSort(int[] arr, int beg, int end) {
		if (beg < end) {
			int mid = (beg + end) / 2;
			isMergeSort(arr, beg, mid);
			isMergeSort(arr, mid + 1, end);
			merge(arr, beg, mid, end);
		}

	}

	private static void merge(int[] arr, int beg, int mid, int end) {
		int i, j, k;

		int size1 = mid - beg + 1;
		int size2 = end - mid;

		int[] leftArray = new int[size1];
		int[] rightArray = new int[size2];

		for (i = 0; i < size1; i++) {
			leftArray[i] = arr[beg + i];
		}
		for (j = 0; j < size2; j++) {
			rightArray[j] = arr[mid + 1 + j];
		}
		i = 0;
		j = 0;
		k = beg;

		while (i < size1 && j < size2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i++];
				
			} else {
				arr[k] = rightArray[j++];
				
			}
			k++;
		}
		while (i < size1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < size2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}

	}
}
