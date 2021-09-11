public class LargestPrimeFactor {
	public static void main(String[] args) {
		long largest = 0;
		int count = 1;
		long prime;
		long num = 600851475143 / 2;
		
		while(count < num) {
			if(num % count == 0) {
				long sumOfDivisors = 0;
				int divisor = 1;
				while(divisor <= count) {
					if(count % divisor == 0) {
						sumOfDivisor += divisor;
					}
					divisor++;
				}
				if(sumOfDivisor == (count + 1)) {
					prime = count;
					if(prime > largest) {
						largest = prime;
					}
				}
			}
			count++;
		}
		System.out.println(prime);
	}
}
