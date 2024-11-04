package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	void isValidPattern(String str, String rex) {
		Pattern pt = Pattern.compile(rex);
		Matcher mt = pt.matcher(str);
		boolean mc = mt.matches();
		System.out.println(mc);
	}
	
	boolean isValidName(String str) {
		String rex="[a-zA-Z ]+";
		boolean b = Pattern.compile(rex).matcher(str).matches();
		return b;
	}

	public static void main(String[] args) {
		Validation vl = new Validation();
		while(true){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String str = sc.nextLine();
		
		boolean b =vl.isValidName(str);
		if(b)System.out.println("name added");
		else System.out.println("Invalid name");
		System.out.println("want to exit (Press Y/any");
		String exit = sc.next();

		if (exit.equalsIgnoreCase("y")) {
			System.out.println("exit window");
			break;

		}
		}
		
		
		
		
		
		
		
		
		
		

//		while (true) {
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter the regex pattern: ");
//
//			String rex = sc.nextLine();
//
//			System.out.println("Enter you name: ");
//
//			String str = sc.nextLine();
//
//			Validation vl = new Validation();
//			vl.isValidPattern(str, rex);
//
//			System.out.println("want to exit (Y/any");
//			String exit = sc.next();
//
//			if (exit.equalsIgnoreCase("y")) {
//				System.out.println("exit window");
//				break;
//
//			}
//
//		}

	}

}
