package streamAPI;

import java.util.Arrays;
import java.util.List;

public class forEach {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,5,34,5,32,63,64,2,64,223);
		list.stream().forEach(i->System.out.println(i));
		System.out.println("________________________________________");
		list.forEach(System.out::println);
	}
}
