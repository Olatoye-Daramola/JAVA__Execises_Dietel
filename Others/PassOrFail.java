/*** 
Prompt user for input
If user score is greater than 60, print "passed"
If user score is less than 60, print "failed"
**/

import java.util.Scanner;

public class PassOrFail{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter thine score, oh mere mortal!");
		int userNumber = scanner.nextInt();
		
		if(userNumber >= 60){
			System.out.println("Thou art passed well, immortal!");
		} else {
			System.out.println("Thou art failed woefully, buff up!");
		}
	}
}
