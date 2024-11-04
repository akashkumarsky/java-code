package javaArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Q14Marge_Overlapping_Interval {
	public static int[][] overlapping(int[][] arr) {
		Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
		
		ArrayList<int []> list = new ArrayList<>();
		
		for(int[] i : arr) {
			if(list.size()==0) {
				list.add(i);
			}else {
				int [] prev_interval_end = list.get(list.size()-1);
				
				if(i[0]<prev_interval_end[1]) {
					prev_interval_end[1] = Math.max(i[1], prev_interval_end[1]);
				}else {
					list.add(i);
				}
			}
		}
		return list.toArray(new int [list.size()] []);
		
	}
	
	public static void main(String [] args) {
		int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
		// Output: [[1,6],[8,10],[15,18]]
		int [][] output =overlapping(arr);
		System.out.println();
		System.out.print("[");
		for(int [] i : output) {
			System.out.print(Arrays.toString(i));
		}
		System.out.print("]");
		
	
	}
	
}
