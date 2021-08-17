public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		int count = 0;
		String sequence = "" + a + ", " + b;
		
		while(count < 10) {
			c = a + b;
			sequence += ", " + c;
			a = b;
			b = c;
			count++;
		}
		System.out.println(sequence);
	}
}
