import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int userNumber = scan.nextInt();
		
		int factorial = 1;
		
		
		//collecting input
		//multiply input until its 1
	//	while(userNumber !=1){
		//	factorial = factorial * userNumber;
			//userNumber --;
		
		//}
		
		
		for(int count = 1; count <= userNumber;){
		//	if(userNumber > 0){
			factorial = factorial * userNumber;
				
			userNumber--;		
		//count++;
	//		}
	}
		
		System.out.println(factorial);
	}
}
