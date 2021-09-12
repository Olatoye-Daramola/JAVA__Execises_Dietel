import java.util.Arrays;


public class HighestAndSecondHighest {
	public static void main(String... args) {
		int[] unsorted = new int[]{4, 2, 6, 1, 3, 5, 8, 7, 0, 9};

		for(int i = 0; i < unsorted.length; i++) {
			for (int j = 0; j < unsorted.length; j++) {
				if (unsorted[i] < unsorted[j]) {
					int temp = unsorted[i];
					unsorted[i] = unsorted[j];
					unsorted[j] = temp;
				}
			}
		}
		int highest = unsorted[unsorted.length - 1];
		int x = 2;
		int secondHighest = unsorted[unsorted.length - x];
		while (secondHighest == highest) {
			secondHighest = unsorted[unsorted.length - x];
			x++;
		}
		System.out.println("\nHighest: " + highest + "\nsecondHighest: " + secondHighest);
	}
}
