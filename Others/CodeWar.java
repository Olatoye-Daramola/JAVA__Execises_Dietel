package TryoutsAgain;

import java.util.Arrays;

public class CodeWar {
    public static void main(String... args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4};
        int[] array3 = new int[2];
        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array1.length; j++) {
                if (array1[i] + array1[j] == array2[0]) {
                    array3[0] = j;
                    array3[1] = i;
                }
            }
        }
        System.out.println(Arrays.toString(array3));
    }
}
