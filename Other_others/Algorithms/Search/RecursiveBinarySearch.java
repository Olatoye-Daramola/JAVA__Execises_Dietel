package Algorithms.Search;

public class RecursiveBinarySearch {

    public static boolean isInList(int[] list, int target) {
        if (list.length == 0) return false;
        else {
            int midPoint = list.length / 2;
            if (list[midPoint] == target) return true;
            else {
                int[] new_list = new int[midPoint];
                createNewListBasedOnPositionOfTargetInList(list, target, midPoint, new_list);
                return isInList(new_list, target);
            }
        }
    }

    private static void createNewListBasedOnPositionOfTargetInList(int[] list, int target, int midPoint, int[] new_list) {
        if (target > list[midPoint]) {
            targetMoreThanMidPoint(list, midPoint, new_list);
        }
        else {
            targetLessThanMidPoint(list, midPoint, new_list);
        }
    }

    private static void targetMoreThanMidPoint(int[] list, int midPoint, int[] new_list) {
        for (int i = midPoint + 1, index = 0; i <= list.length - 1; i++, index++) {
            new_list[index] = list[i];
        }
    }

    private static void targetLessThanMidPoint(int[] list, int midPoint, int[] new_list) {
        for (int i = 0; i <= midPoint - 1; i++) {
            new_list[i] = list[i];
        }
    }

    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(isInList(list, 7));
    }
}
