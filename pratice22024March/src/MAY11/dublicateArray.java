package MAY11;

import java.util.Arrays;

public class dublicateArray {
	public static void finddublicate(int [] arr) {
		Arrays.sort(arr);
		for(int i =0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String [] args) {
		
		int [] arr = {3,5,5,6,3,6,7,8};
		dublicateArray.finddublicate(arr);
	}
}
