package DSA_Day_2;

public class Reverse_String {
	public static void main(String[] args) {
        String str = "Trishita Maity";
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        String reversed = sb.toString();
        System.out.println(reversed);
    }
}