package Day_3_Assignment;

public class Pattern1 {
	public static void Pattern_Upper(int row, int column) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < row - i - 1; j++) {
				System.out.print("  ");
			}
			for(int k = 0; k < i + 1; k++) {
				System.out.print("* ");
			}
			for(int l = 0; l < i + 1; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}	
	public static void Pattern_Lower(int row, int column) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for(int k = 0; k < row - i; k++) {
				System.out.print("* ");
			}
			for(int l = 0; l < column - i; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pattern_Upper(3, 3);
		Pattern_Lower(3, 3);
	}
}
