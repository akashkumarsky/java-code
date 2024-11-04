package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraySort1 {

	public static void main(String[] args) {
		// Default sorting
		List<Integer> list = Arrays.asList(34, 3, 6, 2, 72, 23, 8);

		List<Integer> list1 = list.stream().sorted().toList();

		// Sorting Stream Elements in Reverse Order
		List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).toList();

		// sorting using custom Comparator+++++++++++++++++++++++++++++++++++
		Comparator<Integer> reverseComparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2.compareTo(i1);
			}
		};
		List<Integer> list3 = list.stream().sorted(reverseComparator).toList();
		// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		// Stream Sorting using Lambda Expressions---------------------------------
		// ascending order
		List<Integer> list5 = list.stream().sorted((a, b) -> a.compareTo(b)).toList();

		// decending order
		List<Integer> list6 = list.stream().sorted((b, a) -> a.compareTo(b)).toList();
		
		//---------------------------------------------------------------------------
		

		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println(list5);
		System.out.println(list6);
		System.out.println();
		
		
//##################################################################################
		List<String> list10 = Arrays.asList("EEE","A","BB","AA","CCC","d");
		
		Comparator<String>  com = (a,b)->{
			int l1 =a.length();
			int l2 = b.length();
			if(l1<l2) return -1;
			else if (l1>l2) return 1;
			else return 0;
			
		};
		//sort by length
		List<String> list11 = list10.stream().sorted(com).toList();
		
		//sort by alphabet (default method)
		List<String> list12 = list10.stream().sorted().toList();
		
		//sort by alphabet (Manually )
		List<String> list13 = list10.stream().sorted((a, b) -> a.compareTo(b)).toList();
		
		//reverse the list
		List<String> list14 = list10.stream().sorted((b, a) -> a.compareTo(b)).toList();
		
		//with reverse with negative  (-a.compareTo(b))
		List<String> list15 = list10.stream().sorted((b, a) -> -a.compareTo(b)).toList();
		
		
		//sort by lenght 
		List<String> list16 = list10.stream().sorted((a,b) -> Integer.compare(a.length(), b.length())).toList();
		
		//sort by lenght
		List<String> list17 = list10.stream().sorted(Comparator.comparingInt(String::length)).toList();
		
		System.out.println(list11);
		System.out.println(list12);
		System.out.println(list13);
		System.out.println(list14);
		System.out.println(list15);
		System.out.println(list16);
		System.out.println(list17);
		
		
		
		

	}

}
