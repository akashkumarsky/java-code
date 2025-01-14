package javaArray;

import java.util.Arrays;

//merge_two_sorted_Arrays without using extra space

public class Q12Merge_two_sorted_Arrays {
	// brute-force method
	public static void merge_sort1(int[] arr1, int[] arr2, int n, int m) {
		int[] arr3 = new int[n + m];
		int left = 0;
		int right = 0;
		int index = 0;

		while (left < n && right < m) {
			if (arr1[left] <= arr2[right]) {
				arr3[index++] = arr1[left++];
			} else {
				arr3[index++] = arr2[right++];
			}
		}

		while (left < n) {
			arr3[index++] = arr1[left++];
		}

		while (right < m) {
			arr3[index++] = arr2[right++];
		}
		for (int i = 0; i < n + m; i++) {
			if (i < n) {
				arr1[i] = arr3[i];
			} else {
				arr2[i-n] = arr3[i];
			}
		}

	}
	//optimize solution 
	public static void mergesort(int[] arr1, int[] arr2, int n, int m) {
	int left = n-1;
	int right = 0;
	
	while(left>=0 && right<m) {
		if(arr1[left]>arr2[right]) {
			int temp = arr1[left];
			 arr1[left] =arr2[right];
			 arr2[right] = temp;
			left--;right++;
		}else {
			break;
		}
	}
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 6, 7 };
		int[] arr2 = { 2, 4, 8, 73 };
		int n = arr1.length;
		int m = arr2.length;
		mergesort(arr1, arr2, n, m);//brute force 
		merge_sort1(arr1, arr2, n, m);//optimize method
		System.out.println("New sorted Arrays are");
		System.out.print("arr1 = ");
		for(int i : arr1) {
			System.out.print(i+", ");
		}
		System.out.println();
		System.out.print("arr2 = ");
		for(int i : arr2) {
			System.out.print(i+", ");
		}
	}

}
