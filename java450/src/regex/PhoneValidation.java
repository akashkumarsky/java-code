package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneValidation {
	boolean isValidPhone(String str) {
		String rex = "[0-9]{10}";
		boolean b = Pattern.compile(rex).matcher(str).matches();
		return b;
	}

	public static void main(String[] args) {
		PhoneValidation vl = new PhoneValidation();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your phone no: ");
			String str = sc.nextLine();

			boolean b = vl.isValidPhone(str);
			if (b)
				System.out.println("number added");
			else
				System.out.println("Invalid number");
			System.out.println("want to exit (Press Y/any");
			String exit = sc.next();

			if (exit.equalsIgnoreCase("y")) {
				System.out.println("exit window");
				break;

			}
		}
	}
}
