import java.util.Scanner;

public class TwoPointThreeFive{
	public static void main(String[] args){

		Scanner userInput = new Scanner(System.in);


		int drivingCostPerDay, totalMiles, gasolineCost, averageMilesPerGallon, parkingFee, tollPerDay;

		System.out.println("Enter total miles driven per day:");
		totalMiles = userInput.nextInt();

		System.out.println("Enter cost per gallon of gasoline:");
		gasolineCost = userInput.nextInt();

		System.out.println("Enter Average miles per gallon:");
		averageMilesPerGallon = userInput.nextInt();

		System.out.println("Enter parking fees per day:");
		parkingFee = userInput.nextInt();

		System.out.println("Enter toll per day:");
		tollPerDay = userInput.nextInt();


		drivingCostPerDay = (totalMiles / averageMilesPerGallon ) * gasolineCost + parkingFee + tollPerDay;


		System.out.printf("Cost of driving per day is $%d%n", drivingCostPerDay);

	}
}
