package array;

public class ReveseArray {
	void revese(int[] arr) {
		int size = arr.length;
		for(int i =0;i<size/2; i++) {
			int temp = arr[i];
			arr[i] = arr[size-1-i];
			arr[size-1-i] = temp;
		}
	}
	int[] revese1(int [] arr) {
		int size = arr.length;
		int [] arr1 =new int[size];
		for(int i =0; i<size-1; i++) {
			arr1[i]=arr[i];
		}
		return arr1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {12,34,53,64,66,75,72,34};
		ReveseArray ar = new ReveseArray();
		ar.revese(arr);
		for(int i: arr) {
			System.out.print(i+", ");
		}
		System.out.println();
		int [] ans = ar.revese1(arr);
		for(int i: arr) {
			System.out.print(i+", ");
		}

	}

}
