import java.util.Scanner;

public class HollowSquare {
	public static void main(String[] args) {
		hollow();
	}
	public static void hollow() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your square:");
		int userInput = sc.nextInt();
		
		for(int i = 1; i <= userInput ; i++) {
			for(int j = 1; j <= userInput; j++) {
				boolean bool = i != 1 && i != userInput && j != 1 && j != userInput;
				if(bool) {
					System.out.print("    ");
				}
				else {
					System.out.print("*   ");
				}
			}
			System.out.println("   ");
		}
	}
}
