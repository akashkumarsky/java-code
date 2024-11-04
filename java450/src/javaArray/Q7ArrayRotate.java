package javaArray;
//Rotate the Array by one side clock-wise
public class Q7ArrayRotate {
	
	public static void rotate(int [] arr) {
		int temp = arr[arr.length-1];
		for(int i =arr.length-1; i>0;i--) {
			arr[i] =arr[i-1];
		}
		arr[0]=temp;
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		rotate(arr);
		
	}
}
