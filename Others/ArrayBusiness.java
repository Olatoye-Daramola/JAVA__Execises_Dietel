import java.util.Scanner;

public class ArrayBusiness {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		int[] scores = new int[10];
		int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE, total = 0;
	
		for(int i = 0; i < 10; i++) {
			System.out.println("Enter number " + (i + 1) + ":");
			scores[i] = input.nextInt();
			
			total += scores[i];
			if(scores[i] > largest) {
				largest = scores[i];
			}
			if(scores[i] < smallest) {
				smallest = scores[i];
			}
		}
		int average = total / 10;
		System.out.printf("%nThe total = %d,%nThe average = %d,%nThe largest =%d,%nThe Smallest = %d%n", total, average, largest, smallest);
	}
}
