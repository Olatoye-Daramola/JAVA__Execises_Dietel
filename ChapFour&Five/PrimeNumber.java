import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your integer number: ");
		int number = scan.nextInt();
		
		int count = 2;
		int sum = 0;
		while(count <= number) {
			if(number % count == 0) {
				sum += count;
			}
			count++;
		}
			
		if(sum > number) {	
			System.out.println("Your number is not a prime number");	
		} else {
			System.out.println("Your number is a prime number");
		}
	}
}
