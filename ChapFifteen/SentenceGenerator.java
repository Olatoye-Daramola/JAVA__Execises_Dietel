import java.security.SecureRandom;

public class SentenceGenerator {
    private static String[] article = {"a", "the", "some", "one", "any"};
    private static String[] noun = {"dog", "car", "boy", "girl", "town"};
    private static String[] verb = {"drove", "jump", "ran", "walked", "skipped"};
    private static String[] preposition = {"to", "from", "over", "under", "on"};

    public static String createSentence() {
        SecureRandom indexGenerator = new SecureRandom();
        int randomIndex = indexGenerator.nextInt(5);

        String firstWord = article[randomIndex];
        firstWord = firstWord.replaceFirst("[a-z]", String.valueOf(firstWord.charAt(0)).toUpperCase());

        StringBuilder sentence = new StringBuilder(firstWord);
        sentence.append(" ").append(noun[randomIndex]).append(" ").append(verb[randomIndex])
                .append(" ").append(preposition[randomIndex]);

        randomIndex = indexGenerator.nextInt(5);
        sentence.append(" ").append(article[randomIndex]).append(" ").append(noun[randomIndex]);

        return sentence.toString();
    }

    public static void main(String[] args) {
        System.out.println(createSentence());
    }
}
