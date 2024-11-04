package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(34,4,64,6,7,2,5,1,775,43);
		
		Integer minValue = list.stream().min((a,b)->Integer.compare(a, b)).get();
		System.out.println(minValue);
		
		Integer maxValue = list.stream().max((a,b)->Integer.compare(a, b)).get();
		System.out.println(maxValue);
		
		Comparator<Integer> c = (a,b)-> {
			return Integer.compare(a, b);
		};
		
		Integer value = list.stream().max(c).get();
		System.out.println(value);
		
		
		
		
	}
}
