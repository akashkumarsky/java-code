package MAY12;

import java.util.Arrays;

public class MargeToSortedArray {
	public static void optimizemethod(int [] arr1, int [] arr2) {
		int size1 = arr1.length;
		int size2 = arr2.length;
		
		int arr1last = size1-1;
		int arr2first = 0;
		
		while(arr1last>=0 && arr2first<size2) {
			if(arr1[arr1last]>arr2[arr2first]) {
				int temp = arr1[arr1last];
				arr1[arr1last] =arr2[arr2first];
				arr2[arr2first] = temp;
				arr1last--;arr2first++;
			}else {
				break;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i : arr1) System.out.print(i+" ");
		for(int i : arr2) System.out.print(i+" ");
	}
	public static void mergesort(int [] arr1, int [] arr2) {
		int size1 = arr1.length;
		int size2 = arr2.length;
		int [] newarr = new int [size1+size2];
		int i =0,j=0;
		int k=0;
		while(i<size1 && j<size2) {
			if(arr1[i]<arr2[j]) {
				newarr[k++]=arr1[i++];
			}else if(arr1[i]>arr2[j]){
				newarr[k++]=arr2[j++];
			}else {
				newarr[k++]=arr1[i++];
				
			}
			
			
		}
		while(i<size1) {
			newarr[k++] = arr1[i++];
		}
		while(j<size2) {
			newarr[k++] = arr2[j++];
		}
		for(int  o =0; o<size1+size2; o++){
			if(o<size1) {
				arr1[o]=newarr[o];
			}else {
				arr2[o-size1]=newarr[o];
			}
		}
		for(int l : arr1) {
			System.out.print(l+" ");
		}
		System.out.println();
		for(int l : arr2) {
			System.out.print(l+" ");
		}
	}
	public static void main(String[] agrs) {
		int [] arr1 = {1,6,7,8,12};
		int [] arr2 = {1,3,5,6,7,8};
		//MargeToSortedArray.mergesort(arr1,arr2);
		MargeToSortedArray.optimizemethod(arr1, arr2);
	}
}
