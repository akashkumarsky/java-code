package comperableAndComperater;

public class Employee implements Comparable<Employee>{
	 String Name;
	 int id;
	 int weight;
	
	public Employee(String name, int id, int weight) {
		super();
		Name = name;
		this.id = id;
		this.weight = weight;
	}
	

	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return " [Name=" + Name + ", id=" + id + ", weight=" + weight + "]\n";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.Name.compareToIgnoreCase(o.Name);
	}

	
	
}
