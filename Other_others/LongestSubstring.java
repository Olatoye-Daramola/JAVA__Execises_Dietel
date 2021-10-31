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

//    private static int longestSubstring(String string, int startIndex) {
//        ArrayList<Character> characters = new ArrayList<>();
//        int counter = 0;
//        for (int i = startIndex; i < string.length(); i++) {
//            if(characters.contains(string.charAt(i))) {
//                longestSubstring(string, i);
//            }
//            characters.add(string.charAt(i));
//            counter++;
//        }
//        return counter;
//    }


    public static void main(String[] args) {
        String string = "pwwkew";
        int startIndex = 0, endIndex = string.length();
        System.out.println(longestSubstring(string));
//        System.out.println(longestSubstring(string, startIndex));
    }
}
