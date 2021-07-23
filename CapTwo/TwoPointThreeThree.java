import java.util.Scanner;

public class TwoPointThreeThree{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		
		float weightInKilograms, heightInMeters, BMI;
		
		System.out.println("Enter your weight(in kilograms)");
		weightInKilograms = userInput.nextFloat();
		
		System.out.println("Enter your height(in meters)");
		heightInMeters = userInput.nextFloat();
		
		BMI = weightInKilograms / (heightInMeters * heightInMeters);
		
		System.out.printf("Your body mass index is: %f%n%n%n", BMI);
		
		System.out.println("BMI VALUES\n");
		System.out.println("Underweight: less than 18.5\n");
		System.out.println("Normal:		 between 18.5 and 24.9\n");
		System.out.println("Overweight:	 between 25 and 29.9\n");
		System.out.println("Obese:		 30 or greater");

	}
}
