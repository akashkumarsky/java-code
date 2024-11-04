package array;

public class MaximumAndMinimum {
	int min(int[] arr) {
		int size = arr.length;
		int min1 = arr[0];
		for(int i =1;i<size;i++) {
			for(int j =i-1;j<size;j++) {
				if(arr[j]<arr[i] && arr[j]<min1) {
					min1 = arr[j];
				}
			}
		}
		return min1;
	}
	int max(int[] arr) {
		int size = arr.length;
		int max1 = arr[0];
		for (int i = 1; i < size; i++) {
			for (int j = i - 1; j < size; j++) {
				if (arr[i] > arr[j]) {

					if (arr[i] > max1) {

						max1 = arr[i];
					}

				}

			}
		}
		return max1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 4435334, 13343, 12, 34, 53, 500, 64, 66, 75, 72, 34, 700, 1222, 555555 ,1};
		MaximumAndMinimum mn = new MaximumAndMinimum();
		System.out.println(mn.max(arr));
		System.out.println(mn.min(arr));

	}

}
