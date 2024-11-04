package comperableAndComperater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class MycostomeComperater implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.Name.compareTo(o2.Name);
	}
	
}

public class EmployeeHere {
	public static void main(String[] args) {
		Employee e1 = new Employee("akash",111,80);
		Employee e2 = new Employee("amit",12,444);
		Employee e3 = new Employee("ritu",11,40);
		Employee e4 = new Employee("arti",44,43);
		
		ArrayList<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		//Normal list
		System.out.println(list);
		
		// using comprable in Employee.java class
		Collections.sort(list);
		System.out.println(list);
		
		// lamda expration
		Collections.sort(list, (a1,a2)-> Integer.compare(a1.id, a2.id));
		System.out.println(list);
		
		//using direct method
		Collections.sort(list, new Comparator<Employee>() {
			public int compare(Employee a1, Employee a2) {
				return Integer.compare(a1.id, a2.id);
			}
		});
		System.out.println(list);
		
		//using costom class method
		Collections.sort(list, new MycostomeComperater());
		System.out.println(list);
		
		Collections.sort(list, Comparator.comparing(Employee::getId));
		System.out.println(list);
		
	
	}
}
