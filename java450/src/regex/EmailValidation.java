package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	boolean isEmailvalid(String str) {
		String rex = "^[a-zA-Z0-9_.%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$";
//		\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b
		Pattern pt = Pattern.compile(rex);
		Matcher mc =pt.matcher(str);
		boolean b = mc.matches();
		return b;
		
	}
	public static void main(String[] args) {
		EmailValidation ev = new EmailValidation();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the email:");
		String str = sc.nextLine();
		boolean b =ev.isEmailvalid(str);
		System.out.println(b);
	}
}
