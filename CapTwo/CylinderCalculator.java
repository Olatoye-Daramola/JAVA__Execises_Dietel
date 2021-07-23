//OLATOYE DARAMOLA
import java.util.Scanner;
import java.lang.Math;

public class CylinderCalculator{
	public static void main(String[] args){
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Enter the radius of the cylinder");
	double radius = userInput.nextDouble();
	
	System.out.println("Enter the length of the cylinder");
	double length = userInput.nextDouble();
	
	double area = radius * radius * Math.PI;
	double volume = area * length;
	
	System.out.printf("The cylinder with radius %f and length %f has an area %f and volume %f%n", radius, length, area, volume);
	}
}
