package pratice;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 45, 1, 43, 24 };
		int size = arr.length - 1;
		quickSort(arr, 0, size);
		printArr(arr);
		
	}
	private static void printArr (int []arr) {
		for (int i : arr) {
			System.out.print(i+",");
		}
	}

	private static void quickSort(int[] arr, int low, int high) {
		int pi = partition(arr, low, high);
		if (low < pi - 1) {
			quickSort(arr, low, pi-1);
		}
		if (pi < high) {
			quickSort(arr, pi, high);
		}

	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[(low+high)/2];
		while(low<=high) {
			while(arr[low]<pivot) {
				low++;
			}
			while(arr[high]>pivot) {
				high--;
			}
			if(low<=high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			
			low++;
			high--;
			}
		}
		return low;
	}
}
