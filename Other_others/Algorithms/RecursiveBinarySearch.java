package Algorithms;

public class RecursiveBinarySearch {

    public static boolean binarySearch(int[] list, int target) {
        if (list.length == 0) return false;
        else {
            int midPoint = list.length / 2;
            if (list[midPoint] == target) return true;
            else {
                int[] new_list = new int[midPoint];
                if (target > list[midPoint]) {
                    for (int i = midPoint + 1, index = 0; i <= list.length - 1; i++, index++) {
                        new_list[index] = list[i];
                    }
                }
                else {
                    for (int i = 0; i <= midPoint - 1; i++) {
                        new_list[i] = list[i];
                    }
                }
                return binarySearch(new_list, target);
            }
        }
    }

    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(list, 7));
    }
}
