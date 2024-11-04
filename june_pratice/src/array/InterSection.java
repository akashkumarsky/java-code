package array;

//requied sorted array
public class InterSection {
	static void intersec(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j])
				j++;
			else if (arr1[i] < arr2[j])
				i++;
			else {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
			}

		}

	}

	public static void main(String[] args) {
		
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 3, 5, 7 };
		System.out.println("InterSection: ");
		intersec(arr1, arr2);

	}

}
