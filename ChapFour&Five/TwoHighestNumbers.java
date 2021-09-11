// Declare a variable to count number of inputs and initialize it
// Declare and initialize variables to be placeholers for highest and second highest numbers
// While numbers of input is not more than 10
//		prompt user for numbers
//		if the user input is higher than initialized highest placeholder,
//			assign it to the highest
//			if the user input is higher than initialized second highest placeholder but less than the
//			highest number
//				assign it to the second highest
//		increment the counter variable
//	Print the highest and second highest


import java.util.Scanner;

public class TwoHighestNumbers{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int numbers = 1;
		int highest = 0;
		int secondHighest = 0;

		while(numbers <= 10){
			System.out.printf("Enter number %d: ", numbers, "%n");
			int userNumber = scan.nextInt();
			
			boolean isHighest = userNumber > highest;
			boolean isSecondHighest = userNumber > secondHighest && userNumber < highest;
			
			if(isHighest) {
				highest = userNumber;
			} else {
				if(isSecondHighest){
					secondHighest = userNumber;
				}
			}
			numbers++;
		}
		System.out.printf("%nHighest number: %d%n", highest);
		System.out.printf("Second highest number: %d%n", secondHighest);
	}
}
