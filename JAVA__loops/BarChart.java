import java.util.Scanner;

public class BarChart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		String prompt = "Enter numbers between 1 and 30\n";

		System.out.println(prompt);		
		int num1 = sc.nextInt();
		while(!(num1 >= 1 && num1 <= 30)){
			System.out.println("Number 1: Enter a number between 1 and 30");
			num1 = sc.nextInt();
			}
			
		System.out.println(prompt);
		int num2 = sc.nextInt();
		while(!(num2 >= 1 && num2 <= 30)){
			System.out.println("Number 2: Enter a number between 1 and 30");
			num2 = sc.nextInt();
			}

		System.out.println(prompt);
		int num3 = sc.nextInt();
		while(!(num3 >= 1 && num3 <= 30)){
			System.out.println("Number 3: Enter a number between 1 and 30");
			num3 = sc.nextInt();
			}

		System.out.println(prompt);
		int num4 = sc.nextInt();
		while(!(num4 >= 1 && num4 <= 30)){
			System.out.println("Number 4: Enter a number between 1 and 30");
			num4 = sc.nextInt();
			}

		System.out.println(prompt);
		int num5 = sc.nextInt();
		while(!(num5 >= 1 && num5 <= 30)){
			System.out.println("Number 5: Enter a number between 1 and 30");
			num5 = sc.nextInt();
			}

		
		for(int row = 1; row <= num1; row++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int row = 1; row <= num2; row++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int row = 1; row <= num3; row++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int row = 1; row <= num4; row++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int row = 1; row <= num5; row++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
