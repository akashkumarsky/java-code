package javaArray;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
// find the duplicate in an array of N + 1 Integer
public class Q11Duplicate_N_Plus_Array {
	
	public static void findDuplicate(int [] arr) {
		Arrays.sort(arr);
		Set<Integer> st = new HashSet<>();
		for(int i = 0 ; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				st.add(arr[i]);
			}
		}
		for(Integer i : st) {
			System.out.print(i+" ");
		}
		
	}
	public static void main(String [] args) {
		int [] arr = {1,4,54,6,3,24,3,3,3,4,4,5,3};
		findDuplicate(arr);
		
		
		
		
	}
}
