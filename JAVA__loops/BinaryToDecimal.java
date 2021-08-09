import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your binary number");
		int binary = sc.nextInt();
		int temp = binary;
		
		/* Get length of binary */
		int length = 0;
		int temp2 = 1;
		while(temp2 <= binary) {
			length++;
			temp2 *= 10;
		}
		
		int multiplier = 1;
		int count = 1;
		int temp3 = 0;
		
		while(count <= length) {
			temp3 += (binary % 10) * multiplier;
			binary /= 10;
			multiplier *= 2;
			
			count++;
		}
		
		System.out.printf("The decimal value of %d is %d%n", temp, temp3);
	
	
	
		
	}
}
