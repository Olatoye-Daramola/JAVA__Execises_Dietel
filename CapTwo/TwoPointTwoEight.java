import java.util.Scanner;
import java.lang.Math;

public class TwoPointTwoEight{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter the radius of the Circle: ");		
		int radius = userInput.nextInt();
		
		//float diameter, circumference, area;
		
		System.out.printf("Diameter = %f%n", (2.0 * radius));
		System.out.printf("Circumference = %f%n", (2 * Math.PI * radius));
		System.out.printf("Area = %f%n", (Math.PI * (radius * radius)));
		
	}
}
