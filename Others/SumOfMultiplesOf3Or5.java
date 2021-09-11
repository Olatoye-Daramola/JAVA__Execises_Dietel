public class SumOfMultiplesOf3Or5 {
	public static void main(String[] args) {
		int total = 0;
		int count = 1;
		
		while(count < 1000) {
			if(count%3 == 0 || count%5 == 0) {
				total += count;
			}
			count++;
		}
		System.out.println(total);
	}
}
