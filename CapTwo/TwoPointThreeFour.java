import java.util.Scanner;
import java.lang.Math;

public class TwoPointThreeFour{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		
		double time;
		long currentPopulation;
		double growthRate, estimatedPopulation;
		
		System.out.print("Enter the current population");
		currentPopulation = userInput.nextLong();
		
		//System.out.print("Enter the current population growth rate");
		//growthRate = userInput.nextDouble();
		
		System.out.print("Enter the projection year");
		time = userInput.nextInt();

		//double exponent = Math.pow(2.71828, ((growthRate / 100) * time));
		//estimatedPopulation = currentPopulation * exponent;
		
		//if(time == 1){String year = "year";}
		//if(time > 1){String year = "years";}
		System.out.printf("World population in %d%s will be %d", time);
	}
}
