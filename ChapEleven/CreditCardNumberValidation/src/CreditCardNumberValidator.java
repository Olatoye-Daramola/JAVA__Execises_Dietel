package CreditCardNumberValidation.src;

public class CreditCardNumberValidator {

    public static boolean isWithinValidRange(long cardNumber) {
        int length = (String.valueOf(cardNumber)).length();
        return length >= 13 && length <= 16;
    }
}
