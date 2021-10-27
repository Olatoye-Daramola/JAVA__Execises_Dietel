import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] array, int target){
        int[] newArray = new int[2];
        for(int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++) {
                if(array[i] == target - array[j]){
                    newArray[0] = i;
                    newArray[1] = j;
                }else return null;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 11, 15};
        int target = 19;

        System.out.println(Arrays.toString(twoSum(array, target)));
    }
}
