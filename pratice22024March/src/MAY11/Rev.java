package MAY11;

public class Rev {
	
	public static int [] arrReverse(int[] arr) {
		int size = arr.length;
		for(int i =0; i<size/2; i++ ) {
			int temp = arr[i];
			arr[i] = arr[size-1-i];
			arr[size-1-i] = temp;
		}
		return arr;
		
	}
	public static void main(String [] args) {
		int [] arr = {1,53,56,3,2,1,5};
		Rev.arrReverse(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
