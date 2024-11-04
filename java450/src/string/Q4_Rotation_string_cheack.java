package string;

public class Q4_Rotation_string_cheack {
	public static boolean check_Rotation(String str1, String str2) {
		if (str1.length() == str2.length() && (str1 + str1).contains(str2))
			return true;
		return false;
	}

	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "cdab";
		if (check_Rotation(str1, str2)) {
			System.out.println(str2 + " is Rotation of " + str1);
		} else
			System.out.println(str2 + " is not Rotation of " + str1);
	}
}