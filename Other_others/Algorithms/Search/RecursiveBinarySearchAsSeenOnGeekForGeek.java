package Algorithms.Search;

public class RecursiveBinarySearchAsSeenOnGeekForGeek {

    public static boolean isInList(int[] list, int startIndex, int endIndex, int target) {
        if (list.length == 0) return false;
        else {
            if (endIndex >= startIndex && startIndex <= list.length - 1) {
                int midPoint = startIndex + (endIndex - startIndex) / 2;
                if (list[midPoint] == target) return true;
                else {
                    if (target > list[midPoint]) return isInList(list, midPoint + 1, endIndex, target);
                    return isInList(list, startIndex, midPoint - 1, target);
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(isInList(list, 0, list.length, 7));
    }
}
