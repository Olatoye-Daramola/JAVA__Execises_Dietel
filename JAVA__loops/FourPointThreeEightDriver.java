import java.util.Scanner;

public class FourPointThreeEightDriver{
	public static void main(String[] args) {
		
	FourPointThreeEight drive = new FourPointThreeEight();

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter your message");
	int userMessage = scan.nextInt();
	drive.encryptMessage(userMessage);
	
	System.out.println("Good");
		
	}
}
