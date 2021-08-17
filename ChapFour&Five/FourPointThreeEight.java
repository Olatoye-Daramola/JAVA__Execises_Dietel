import java.util.Scanner;

public class FourPointThreeEight{
	public static void main(String[] args) {
		
	Encrypt driver = new Encrypt();
	Decrypt driver2 = new Decrypt();

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter your message");
	String userMessage = scan.next();
	
	while(userMessage.length() != 4){
		System.out.println("Enter your fucking message");
		userMessage = scan.next();
	}
	driver.encryptMessage(userMessage);
//	driver2.decryptMessage(userMessage);
	
		
	}
}
