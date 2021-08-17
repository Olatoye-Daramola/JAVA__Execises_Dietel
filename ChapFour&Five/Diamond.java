public class Diamond {
	public static void main(String[] args) {
		for(int row = 10; row >= 1; row--) {
			for(int column = 1; column <= row; column++) {
				System.out.print(" ");
			}
			for(int column2 = 10; column2 >= row; column2--) {
				System.out.print("*");
			}
			for(int column = 10; column > row; column--) {
				System.out.print("*");
			}
			System.out.println();
			}			
			
		for(int row = 2; row <= 10; row++) {
			for(int column = 1; column <= row; column++) {
				System.out.print(" ");
			}
			for(int column2 = 10; column2 >= row; column2--) {
				System.out.print("*");
			}
			for(int column = 10; column > row; column--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}
