import java.util.Scanner;

public class nameReverse {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		System.out.println("State your name, human:");
		String name = input.nextLine();
		
		for (int row = name.length() - 1; row >= 0; row--) {
			System.out.print(name.charAt(row));
		}
		System.out.println();
	}
}
