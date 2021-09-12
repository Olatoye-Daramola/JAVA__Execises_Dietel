import java.util.Arrays;


public class Swap {
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
		System.out.println(Arrays.toString(unsorted));
	}
}
