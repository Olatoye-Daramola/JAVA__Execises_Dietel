import java.util.Scanner;

public class BarChartLooped {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String save = "";
		int count = 0;
		
		System.out.println("Enter five numbers between 1 and 30\nPress the ENTER key after each entry");
		
		while(count < 5) {
			int num = sc.nextInt();
		
			while(!(num >= 1 && num <= 30)) {
				System.out.println("Fucking enter a number between 1 and 30 and press the ENTER key the entry");
				num = sc.nextInt();
			}
			for(int row = 1; row <= num; row++) {
				save += "*";
			}
			save += "\n";
			count++;
			}
		System.out.println();
		System.out.println(save);
		}
	}

