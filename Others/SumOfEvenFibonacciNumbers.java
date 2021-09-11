public class SumOfEvenFibonacciNumbers {
	public static void main(String[] args) {
		long a = 1;
		long b = 2;
		long c = 0;
		long sum = 2;
		
		while(c < 4_000_000) {
			c = a + b;
			a = b;
			b = c;
			
			if(c%2 == 0) {
				sum += c;
			}
			
			c++;
		}
		System.out.println(sum);
	}
}
