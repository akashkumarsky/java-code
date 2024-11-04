package MAY12;

import java.util.ArrayList;

public class AlternatePositions {
	public static void alternet(int [] arr) {
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>0) al.add(arr[i]);
			else al2.add(arr[i]);
		}
		for(int i =0;i<arr.length/2; i++) {
			arr[i*2] = al.get(i);
			arr[i*2+1]= al2.get(i);
		}
		for(int i: arr)System.out.print(i+", ");
	}
	public static void main (String [] args) {
		int [] arr = {1,3,-4,-5};
		AlternatePositions.alternet(arr);
	}
}
