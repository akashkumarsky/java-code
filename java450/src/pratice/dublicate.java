package pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class dublicate {
	public static void removeDublicate(int [] arr) {
		int size = arr.length ;
		int j = 0;
		for(int i =0;i<size; i++) {
			if(arr[i]!=arr[j]) {
				j++;
				arr[j] = arr[i];
			}
		}
		for(int i =0;i<j+1; i++)System.out.print(arr[i]+" ");
		
		
	}
	

	public static void main(String[] args) {
		int[] arr = {0,0,1,2, 2, 3, 3, 3, 4, 4 ,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,5,5,6,7,8,9,9,17};
		
		
		removeDublicate(arr);
		System.out.println();
		
		

	}
}
