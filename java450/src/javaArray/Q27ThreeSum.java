package javaArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q27ThreeSum {
	static void threeSum(int[] array, int sum) {
		Set<List<Integer>> ans = new HashSet<>();

		Arrays.sort(array);
		for (int i = 0; i < array.length - 2; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if (array[i] + array[j] + array[k] == sum) {
						
						// System.out.println("Triplet is [" + array[i] + " , " + array[j] + " , " +
						// array[k] + "]");
						ans.add(Arrays.asList(array[i], array[j], array[k]));
					}
				}
			}

		}
		for (List<Integer> list : ans) {
			for (Integer integer : list) {
				System.out.print(integer + " ");
			}
			System.out.println();
		}

	}
	//optimize method
	static List<List<Integer>> solution(int[] array){
		
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(array);
		for(int i =0; i<array.length;i++) {
			if(i>0 && array[i]==array[i-1]) continue;
			int j = i+1;
			int k = array.length-1;
			while(j<k) {
				int sum1 = array[i] + array[j] + array[k];
				if(sum1<0) {
					j++;
				}else if(sum1>0) {
					k--;
				}else {
					ans.add(Arrays.asList(array[i],array[j],array[k]));
					j++;
					k--;
					while(j<k && array[j] == array[j-1]) j++;
					while(j<k && array[k] == array[k+1]) k--;
				}
			}
		}
		
		
		return ans;
	}
	

	public static void main(String[] args) {
		int[] array = { -1,0,1,2,-1,-4 };
		int sum = 0;
		//threeSum(array, sum);
		List<List<Integer>> temp = solution(array);
		for(List<Integer> x : temp) {
				System.out.println(x);
		}
	}
}
