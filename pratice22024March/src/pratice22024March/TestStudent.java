package pratice22024March;
class Student{
	int rno;
	String name;
	Student(int rno, String name){
		this.rno =rno;
		this.name = name;
	}
	public String toString() {
		//return getClass().getName()+"@"+Integer.toHexString(hashCode());
		return rno+" "+name;
	}
}
public class TestStudent {
	public static void main(String [] args) {
		Student s1 = new Student(101,"akash");
		Student s2 = new Student(102,"amit");
		System.out.println(s1.toString());
		System.out.println(s1.getClass());
		System.out.println(s1.getClass().getName());
	}
}
