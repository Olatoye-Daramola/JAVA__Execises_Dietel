import java.util.Scanner;

public class ScoreCounter{
	public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			
			int total = 0;
			
			System.out.println("Enter number of Students");
			int numberOfStudents = scan.nextInt();
			
			for(int count = 1; count <= numberOfStudents; count++){
				System.out.println("Enter score "+ count);
				int score = scan.nextInt();
			
				total = total + score;
			}
			
			double average = (double) total / numberOfStudents;
					
			System.out.println("Total score: "+ total + "\n" + "Average score: " + average);
	}
}
