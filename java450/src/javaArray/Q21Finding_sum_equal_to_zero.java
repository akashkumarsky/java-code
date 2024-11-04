package javaArray;

public class Q21Finding_sum_equal_to_zero {
	public static boolean findingSum(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == sum) 
				return true;
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) 
					return true;

				
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 6, 1, 53, 0 };
		if (findingSum(arr)) {
			System.out.println("zero found");
		} else {
			System.out.println("zero not found");
		}
	}
}
