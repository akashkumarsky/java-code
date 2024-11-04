package pratice;

public class Insertion {
public static void main(String[] args) {
	int[] arr = new int[] {13,5,56,2,1,64};
	insertionsort(arr);
	for (int i : arr) {
		System.out.print(i+",");
	}
}

private static int [] insertionsort(int [] arr) {
	for (int i = 1; i < arr.length-1; i++) {
		int temp = arr[i];
		int j = i;
	
		while(j>0&& arr[j-1]>temp) {
			arr[j]=arr[j-1];
			j--;
		}
		arr[j]=temp;
	}
	return arr;
	
}
}
