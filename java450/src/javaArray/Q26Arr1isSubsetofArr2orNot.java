package javaArray;

import java.util.Arrays;

public class Q26Arr1isSubsetofArr2orNot {
	static boolean isSubset1(int [] arr1, int m ,int [] arr2, int n) {
		if(m>n) return false;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i =0;int j=0;
		while(i<m && j<n) {
			if(arr1[i]==arr2[j]) {
				i++;
				j++;
			}else if(arr1[i]>arr2[j]) {
				j++;
			}else if(arr1[i]<arr2[j]) {
				return false;
			}
			
		}
		 return true;
	}
	static boolean isSubset(int [] arr1, int m ,int [] arr2, int n) {
		if(m>n) return false;
		
		for(int i =0 ;i<m;i++) {
			boolean present = false;
			for(int j =0 ; j<n ; j++) {
				if(arr1[i]==arr2[j]) {
					present = true;
					break;
				}
			}
			if(present == false) return false;
		}
		
		
		return true;
	}

	public static void main(String[] args) {

	    int arr1[]= {3,1,2,5,15};
		int arr2[]={2,4,3,1,7,5,15};

	    int m = arr1.length;
	    int n = arr2.length;

	    boolean ans = isSubset1(arr1, m, arr2, n);

	    if (ans == true)
	      System.out.print("arr1[] is a subset of arr2[]");
	    else System.out.print("arr1[] is not a subset of arr2[]");
	}

}
