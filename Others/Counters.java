public class Counters{
	public static void main(String[] args) {
		System.out.println("Counter 1: " + counter1());
		System.out.println("Counter 2: " + counter2());
		System.out.println("Counter 3: " + counter3());
		System.out.println("Counter 4: " + counter4());
	}
	
	public static int counter1() {
		int counter = 1;
		counter = ++ counter + ++counter;
		return counter;
	}
	
	public static int counter2() {
		int counter = 1;
		counter = counter++ + ++counter;
		return counter;
	}
	public static int counter3() {
		int counter = 1;
		counter = counter ++ + counter++;
		return counter;
	}
	public static int counter4() {
		int counter = 1;
		counter = ++counter + counter++;
		return counter;
	}
}
