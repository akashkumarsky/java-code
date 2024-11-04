package arrayPratice;

public class ReverseTheArray {

	static void bruteForceMethod(int[] arr) {
		//Time Complexity: O(n)  
		//Space Complexity: O(n)
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[arr.length - 1 - i];
		}
		for (int i : temp) {
			System.out.print(i + ", ");
		}
	}

	static void optimize1(int[] arr) {
		//Time Complexity: O(n)
		//Space Complexity: O(1)
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

	}

	static void printArr(int[] arr) {
		for (int i : arr) {
			System.out.print(i + ", ");
		}
	}

	static void recurciveMethod(int[] arr, int start, int end) {
		//Time Complexity: O(n)
		//Space Complexity: O(1)
		if (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			recurciveMethod(arr, start + 1, end - 1);
		}
		
	}

	public static void main(String[] args) {
		int[] arr = { 3, 5, 6, 2, 6, 7, 2 };
		// bruteForceMethod(arr);
		// optimize1(arr);
		recurciveMethod(arr, 0, arr.length - 1);
		printArr(arr);
	}

}
