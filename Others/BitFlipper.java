import java.util.Scanner;

public class BitFlipper{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 0 or 1");
		int userNumber = input.nextInt();
		
		
		if(userNumber == 0 || userNumber == 1){
			if(userNumber == 0) {
				System.out.println("1");
			} else {
				System.out.println("0");}
		} else {
			System.out.println("F'ing idiot, that's a wrong input");
		}	
	}
}
