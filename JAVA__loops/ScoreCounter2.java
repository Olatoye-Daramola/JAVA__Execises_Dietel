import java.util.Scanner;

public class ScoreCounter2{
	public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			
			int total = 0;
			
			System.out.println("Enter number of Students");
			int numberOfStudents = scan.nextInt();
			
			for(int count = 1; count <= numberOfStudents;){
				System.out.println("Enter score "+ count);
				int score = scan.nextInt();
				
				boolean scoreIsValid = score >= 0 && score <= 100;
				
				if(scoreIsValid){
					total = total + score;
					count++;
				}
			}
			
			double average = (double) total / numberOfStudents;
//			double average = (total * 1.0) / numberOfStudents;
					
			System.out.println("Total score: "+ total + "\n" + "Average score: " + average);
	}
}
