package MAY11;

public class CyclicallyRotation {
	public static void rotateArray(int [] arr) {
		int size = arr.length;
		int last = arr[arr.length-1];
		for(int i =size-1; i>0; i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=last;
		for(int i: arr) System.out.print(i+" ");
	}
	public static void main(String [] args) {
		int[] arr = {1,3,5,6,7,8};
		CyclicallyRotation.rotateArray(arr);
	}
}
