package pratice;

public class Selection {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 656, 5, 3, 2 };
		int[] ans = selectionsort(arr);
		int [] ans1 = selectionsort1(arr);
		for (int i : ans1) {
			System.out.print(i + ",");
		}
	}

	private static int[] selectionsort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;

		}
		return arr;

	}
	private static int[] selectionsort1(int[] arr) {
		int temp , j , i;
		for (i = 0; i < arr.length - 1; i++) {
			
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			

		}
		return arr;

	}
}
