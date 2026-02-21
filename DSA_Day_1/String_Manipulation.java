package DSA_Day_1;

public class String_Manipulation {
	public static void main(String[] args) {
		String s1 = "Trishita Maity";
		String s2 = new String("Trishita Maity");
		String s3 = s2;
		System.out.println(s1 == s2);
		System.out.println(s3 == s2);
		System.out.println(s1.equals(s2));
	}
}