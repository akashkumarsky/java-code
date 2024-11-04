package javaArray;

import java.util.ArrayList;
import java.util.List;

public class Q32MedianOFTwoSortedArray {
	//optimize method
	static double median_optimize(int [] a , int [] b) {
		int size_a = a.length;
		int size_b = b.length;
		
		int begin = 0;
		int end = size_a;
		
		if(size_a>size_b) return median_optimize(b,a);
		
		while(begin<= end) {
			int mid1 = (size_a/2);
			int mid2 = (size_a+size_b)/2 -mid1;
			
			int left1 = (mid1>0)?a[mid1]:Integer.MIN_VALUE;
			int right1 = (mid2>0)?b[mid2]:Integer.MIN_VALUE;
			
			int left2 = (mid1<size_a)?a[mid1-1]:Integer.MIN_VALUE;
			int right2 = (mid2< size_b)?b[mid2-1]:Integer.MIN_VALUE;
			
			if(left1<= right1 && left2 <= right2) {
				if((size_a+size_b)%2 == 1) return Math.max(left1, left2);
				else return ((double)(Math.max(left1, left2)+Math.min(right1, right2)))/2.0;
			}else if ( left1> right1) end = mid1 -1;
			else begin = mid1 +1;
		}
		return 0;
	}
	
	
	
	//brute force
	static double median(int [] a, int[] b) {
		int size_a = a.length;
		int size_b = b.length;
		
		List<Integer> arr3 = new ArrayList<>();
		int i =0, j=0;
		
		while(i<size_a && j< size_b) {
			if(a[i]<b[j]) {
				arr3.add(a[i++]);
			}else {
				arr3.add(b[j++]);
			}
		}
		
		while(i<size_a) arr3.add(a[i++]);
		while(j<size_b) arr3.add(b[j++]);
		
		int size = size_a+size_b;
		if( size%2 ==1) return (double) arr3.get(size/2);
		return (double) (arr3.get(size/2) +arr3.get(size/2)-1)/2.0;
	}
	 public static void main(String[] args) {
	        int[] a = {1, 4, 7, 10, 12};
	        int[] b = {2, 3, 6, 15};
	        System.out.println("The median of two sorted arrays is " + median(a, b));
	        System.out.println();
	        System.out.println(median(a,b));
	    }
}
