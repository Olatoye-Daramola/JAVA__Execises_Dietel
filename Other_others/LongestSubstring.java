import java.util.ArrayList;

public class LongestSubstring {
    public static int longestSubstring(String str) {
        ArrayList<Character> characters = new ArrayList<>();
        int counter = 0, maxCounter = 0;
        for (int index = 0; index < str.length(); index++) {
            if (characters.contains(str.charAt(index))) {
                counter = 0;
                characters.clear();
            } else {
                characters.add(str.charAt(index));
                counter++;
            }

            if (counter > maxCounter) maxCounter = counter;
        }
        return maxCounter;
    }


    public static void main(String[] args) {
        String string = "pwwkew";
        System.out.println(longestSubstring(string));
    }
}
