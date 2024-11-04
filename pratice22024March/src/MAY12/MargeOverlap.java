package MAY12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MargeOverlap {
	public static void subArray(int [][] arr) {
		Arrays.sort(arr,(a,b)->Integer.compare(a[0],a[0]));
		List<int []> lt =  new ArrayList<>();
		
		for(int[] i : arr ) {
			if(lt.size()==0) {
				lt.add(i);
			}else {
				int [] prev_interval_end = lt.get(lt.size()-1);
				if(i[0]<prev_interval_end[1]) {
					prev_interval_end[1] = Math.max(i[1], prev_interval_end[1]);
				}else {
					lt.add(i);
				}
			}
		}
		int [] [] output =lt.toArray(new int [lt.size()][]);
		for(int [] i: output) {
			System.out.print(Arrays.toString(i)+" ");
		}
		
	}
	public static void main(String [] args) {
		int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
		
		// Output: [[1,6],[8,10],[15,18]] 
		
		MargeOverlap.subArray(arr);
	}
}
