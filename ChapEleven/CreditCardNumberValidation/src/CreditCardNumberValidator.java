package CreditCardNumberValidation.src;

import static CreditCardNumberValidation.src.CreditCardType.*;

public class CreditCardNumberValidator {
    private static CreditCardType creditCardType;

    public static boolean isWithinValidRange(long cardNumber) {
        int length = (String.valueOf(cardNumber)).length();
        return length >= 13 && length <= 16;
    }

    public static CreditCardType getCreditCardType(long cardNumber) {
        String cardNumberString = String.valueOf(cardNumber);
        String cardNumberPrefix = String.valueOf(cardNumberString.charAt(0));

        switch (cardNumberPrefix) {
            case "3":
                if (String.valueOf(cardNumberString.charAt(1)).equals("7"))
                    creditCardType = AMERICAN_EXPRESS_CARD;
                break;
            case "4":
                creditCardType = VISA_CARD;
                break;
            case "5":
                creditCardType = MASTER_CARD_CREDIT_CARD;
                break;
            case "6":
                creditCardType = DISCOVER_CARD;
        }
        return creditCardType;
    }
}
