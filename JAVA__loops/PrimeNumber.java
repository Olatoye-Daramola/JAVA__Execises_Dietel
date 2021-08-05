import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your integer number: ");
		int number = scan.nextInt();
		
		int count = 2;
		boolean flag = false;
		
		while(count <= (number / 2)) {
			if(number % count == 0) {
				flag = true;
				break;
			}
			count++;
		}
			
		if(!flag) {	
			System.out.printf("Your number, %d, is a prime number%n", number);	
		} else {
			System.out.printf("Your number, %d, is not a prime number%n", number);
		}
	}
}
