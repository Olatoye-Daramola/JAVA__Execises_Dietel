import java.util.Scanner;

public class Factors{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your integer number: ");
		int number = scan.nextInt();
		
		int count = 1;
		
		System.out.printf("The factors of %d are: ", number);
		
		while(count <= number){
			if(number % count == 0) {
				System.out.print(count + " ");
			}
			count++;
		}
		System.out.println();
	}
}
