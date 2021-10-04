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

    public static int getDigit(int number) {
        int digit;
        int multiplication = number * 2;
        if (multiplication < 10) {
            digit = multiplication;
        } else {
            String multiplicationToString = String.valueOf(multiplication);
            digit = Character.getNumericValue(multiplicationToString.charAt(0)) +
                    Character.getNumericValue(multiplicationToString.charAt(1));
        }
        return digit;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String stringOfNumber = String.valueOf(number);
        for (int index = stringOfNumber.length() - 2; index >= 0; index -= 2) {
            sum += getDigit(Character.getNumericValue(stringOfNumber.charAt(index)));
        }
        return sum;
    }

    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String stringOfNumber = String.valueOf(number);
        for (int index = stringOfNumber.length() - 1; index >= 0; index -= 2) {
            sum += Character.getNumericValue(stringOfNumber.charAt(index));
        }
        return sum;
    }

    public static boolean isValid(long number) {
        return (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
    }

    public static int getSize(long number) {
        return String.valueOf(number).length();
    }
}
