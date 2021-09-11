import java.util.Scanner;

public class TwoPointThreeZero {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter your 5-digits number");
		 String userInput = sc.next();
		 
		 while(userInput.length() != 5) {
		 	System.out.println("Enter your 5-digits number");
		 	userInput = sc.next();
		 }
		 
		 int temp = Integer.parseInt(userInput);
		 
		 int count = 1;
		 String num = "";
		 int pointer = 100000;
		 int pointer2 = 10000;
		 
		 while(count <= 5) {
		 	temp %= pointer;
		 	num = (String) "" + (temp / pointer2);
		 	System.out.print(num + "   ");
		 	
		 	pointer /= 10;
		 	pointer2 /= 10;
		 	
		 	count++;
		 }
		 System.out.println();
	}
}
