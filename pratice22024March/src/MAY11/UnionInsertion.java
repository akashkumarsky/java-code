package MAY11;

public class UnionInsertion {
	public static void union(int[] arr1, int[] arr2, int size1, int size2) {
		int i = 0;
		int j = 0;
		while (i < size1 && j < size2) {
			if (arr1[i] > arr2[j])
				System.out.print(arr2[j++] + " ");
			else if (arr1[i] < arr2[j])
				System.out.print(arr1[i++] + " ");
			else {
				System.out.print(arr1[i++] + " ");
				j++;
			}
		}
		while (i > size1) {
			arr1[i]++;
		}
		while (j < size2) {
			arr2[j]++;
		}
	}

	public static void insertion(int[] arr1, int[] arr2, int size1, int size2) {
		int i = 0;
		int j = 0;
		while (i < size1 && j < size2) {
			if (arr1[i] < arr2[j])
				arr1[i]++;
			else if (arr1[i] > arr2[j])
				arr2[j]++;
			else {
				System.out.print(arr1[i++] + " ");
				j++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr2 = { 3, 6, 7 };
		int size1 = arr1.length;
		int size2 = arr2.length;
		UnionInsertion.union(arr1, arr2, size1, size2);
		System.out.println();
		UnionInsertion.insertion(arr1, arr2, size1, size2);
	}
}
