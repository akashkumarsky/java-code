package pratice;


import java.util.Arrays;

public class dublicateArray {
	public static void removedub(int [] arr) {
		Arrays.sort(arr);
		int size = arr.length;
		int j =0;
		for(int i = 0;i<size;i++) {
			if(arr[i]!=arr[j]) {
				j++;
				arr[j]=arr[i];
			}
		}
		for(int i =0;i<j+1;i++)System.out.print(arr[i]+" ");
	}
	public static void main(String [] args) {
		int [] arr = {3,6,7,2,64,4,6,3,6,64};
		removedub(arr);
	}
}
