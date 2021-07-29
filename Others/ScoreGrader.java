/*** 
Prompt user for score
If user score is between 90 and 100,
	print "A"
If user score is between 80 and 89,
	print "B"
If user score is between 70 and 79,
	print "C"
If user score is between 60 and 69,
	print "D"
If user score is less than 60,
	print "F"
**/

import java.util.Scanner;

public class ScoreGrader{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter thine score, oh mere mortal!");
		int userScore = scanner.nextInt();
		
		if(userScore >= 90 && userScore <= 100){
			System.out.println("A");
			}
			
		if(userScore >= 80 && userScore <= 89){
			System.out.println("B");
			}
				
		if(userScore >= 70 && userScore <= 79){
			System.out.println("C");
			}
					
		if(userScore >= 60 && userScore <= 69){
			System.out.println("D");
			}
						
		if(userScore < 60){
			System.out.println("F");
			}
	}
}
