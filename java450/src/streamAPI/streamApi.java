package streamAPI;


import java.util.Arrays;
import java.util.List;

public class streamApi {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3434,645,4645,34,34,22,5,7,2);
		
		List<Integer> list1 = list.stream().filter(i->i%2==0).toList();
		List<Integer> list2 = list.stream().filter(i->i%2!=0).toList();
		Long c = list.stream().filter(i->i%2!=0).count();
		
		
		List<Integer> list3 = list.stream().map(i->i*2).toList();
		
		
		
		
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println(c);
		
	}
}
