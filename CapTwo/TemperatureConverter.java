//OLATOYE DARAMOLA
import java.util.Scanner;

public class TemperatureConverter{
	public static void main(String[] args){
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Enter a degree in celsius");
	double celsius = userInput.nextDouble();
	
	double fahrenheit = (9.0 / 5) * celsius + 32;
	
	System.out.printf("%f Celsius is %f Fahrenheit %n", celsius, fahrenheit);
	
	}
}
