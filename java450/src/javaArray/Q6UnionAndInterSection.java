package javaArray;

import java.util.ArrayList;
import java.util.TreeSet;

//find the Union and intersection of the two sorted array
public class Q6UnionAndInterSection {

	// it only working on sorted array and non repeting number
	public static void printUnion(int[] arr1, int[] arr2, int m, int n) {
		int i = 0;
		int j = 0;
		while (i < m && j < n) {
			if (arr1[i] < arr2[j]) {
				System.out.print(arr1[i++] + " ");
			} else if (arr1[i] > arr2[j]) {
				System.out.print(arr2[j++] + " ");
			} else {
				System.out.print(arr1[i++] + " ");
				j++;
			}
		}
		while (i < m) {
			System.out.print(arr1[i++] + " ");
		}
		while (j < n) {
			System.out.print(arr2[j++] + " ");
		}
	}

	public static void usingSets(int[] arr1, int[] arr2) {

		TreeSet<Integer> set = new TreeSet<>();

		for (int i : arr1) {
			set.add(i);
		}

		for (int i : arr2) {
			set.add(i);
		}

		ArrayList<Integer> list = new ArrayList<>();
		for (int i : set) {
			list.add(i);
		}
		for (int i : list) {
			System.out.print(i + " ");
		}

	}

	// --------------------------------------------------------------------------------
	// InterSection
	public static void printInterSection(int[] arr1, int[] arr2, int m, int n) {
		int i = 0, j = 0;
		while (i < m && j < n) {
			if (arr1[i] < arr2[j])
				i++;
			else if (arr1[i] > arr2[j])
				j++;
			else {
				System.out.print(arr2[j++] + " ");
			i++;
			}
		}
		
		
	}

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 3, 5, 7, 10, 11 };
		int[] arr2 = new int[] { 1, 4, 5, 8 };
		int m = arr1.length;
		int n = arr2.length;
		System.out.print("Union of two array:  ");
		// printUnion(arr1, arr2, m, n);//for union
		usingSets(arr1, arr2);// for union
		System.out.println();
		System.out.print("InterSection of two array: ");
		printInterSection(arr1, arr2, m , n);

	}
}
