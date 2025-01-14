package javaArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q24LongestConsuctiveLength {
	
	//brute force---------------------
	static boolean LinearSearch(int [] arr , int num) {
		for(int i =0 ; i<arr.length; i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}

	static int consuctive(int [] arr) {
		int maxlength=1;
		for(int i =0 ;i<arr.length; i++) {
			int num = arr[i];
			int count=1;
			
			while(LinearSearch(arr,num+1)==true) {
				num++;
				count++;
			}
			maxlength=Math.max(maxlength, count);
		}
		 
		
		
		return maxlength ;
	}
//	------------------------
	static int findConsuctive(int[] arr) {
		int count =0;
		int maxlength =1;
		int smallest = Integer.MIN_VALUE;
		Arrays.sort(arr);
		for(int i =0 ; i<arr.length; i++) {
			if(arr[i]-1==smallest) {
				count++;
				smallest = arr[i];
			}else if (arr[i]!=smallest) {
				count =1;
				smallest=arr[i];
			}
			maxlength=Math.max(maxlength, count);
		}
		
		return maxlength;
		
	}
	
	//optimize best approch
	static int findSubConsuctive(int [] arr) {
		int maxlength =1;
		
		Set<Integer> st = new HashSet<>();
		for(int i =0 ; i<arr.length; i++) {
			st.add(arr[i]);
		}
		for(int i : st) {
			if(!st.contains(i-1)) {
				int count = 1;
				int num = i;
				while(st.contains(num+1)) {
					count++;
					num++;
				}
				maxlength = Math.max(maxlength, count);
			}
		}
		
		
		return maxlength;
	}
	public static void main(String [] args) {
		int[] arr = {100, 200, 1, 2, 3, 4};
		//System.out.print(consuctive(arr));
		//System.out.print(findConsuctive(arr));
		System.out.print(findSubConsuctive(arr));
	}
}
