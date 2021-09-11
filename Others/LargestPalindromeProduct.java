public class LargestPalindromeProduct {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 100;
		int product;
		int largest = 0;

		while(num1 <= 999) {
			while(num2 <= 999) {
				product = num1 * num2;
				
				if(product > largest) {
					largest = product;
				}
			num2++;
			}
		num1++;
		}
		System.out.println(largest);
	}
}
