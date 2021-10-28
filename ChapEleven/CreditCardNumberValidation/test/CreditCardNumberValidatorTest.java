package CreditCardNumberValidation.test;

import CreditCardNumberValidation.src.CreditCardNumberValidator;
import org.junit.jupiter.api.Test;

import static CreditCardNumberValidation.src.CreditCardType.*;
import static org.junit.jupiter.api.Assertions.*;

class CreditCardNumberValidatorTest {

    @Test
    void testThatCreditCardNumberLengthIsNotLessThan13() {
        assertFalse(CreditCardNumberValidator.isWithinValidRange(123456789123L));
    }

    @Test
    void testThatCreditCardNumberLengthIsNotMoreThan16() {
        assertFalse(CreditCardNumberValidator.isWithinValidRange(12345678912345678L));
    }

    @Test
    void testThatCreditCardNumberLengthIsWithinTheRangeOf13And16() {
        assertTrue(CreditCardNumberValidator.isWithinValidRange(12345678912345L));
        assertTrue(CreditCardNumberValidator.isWithinValidRange(123456789123456L));
    }

    @Test
    void testThatCreditCardNumberLengthOf13And16IsInValidRangeLimits() {
        assertTrue(CreditCardNumberValidator.isWithinValidRange(1234567891234L));
        assertTrue(CreditCardNumberValidator.isWithinValidRange(1234567891234567L));
    }

    @Test
    void testThatCreditCardIsAVisaCard() {
        assertEquals(VISA_CARD, CreditCardNumberValidator.getCreditCardType(4011111111111L));
    }

    @Test
    void testThatCreditCardIsAMasterCard() {
        assertEquals(MASTER_CARD_CREDIT_CARD, CreditCardNumberValidator.getCreditCardType(5011111111111L));
    }

    @Test
    void testThatCreditCardIsAnAmericanExpressCard() {
        assertEquals(AMERICAN_EXPRESS_CARD, CreditCardNumberValidator.getCreditCardType(3711111111111L));
    }

    @Test
    void testThatCreditCardIsADiscoverCard() {
        assertEquals(DISCOVER_CARD, CreditCardNumberValidator.getCreditCardType(6011111111111L));
    }

    @Test
    void testThatCreditCardValidatorCanReturnCorrectSumOfNumbers() {
        assertEquals(3, CreditCardNumberValidator.getDigit(6));
    }

    @Test
    void testThatCreditCardValidatorCanReturnSumOfDoubleEvenPlace() {
        assertEquals(29, CreditCardNumberValidator.sumOfDoubleEvenPlace(4388576018410707L));
    }

    @Test
    void testThatCreditCardValidatorCanReturnSumOfOddPlace() {
        assertEquals(41, CreditCardNumberValidator.sumOfOddPlace(4388576018410707L));
    }

    @Test
    void testThatCreditCardValidatorCanCheckForNumberValidity() {
        assertTrue(CreditCardNumberValidator.isValid(4388576018410707L));
    }

    @Test
    void testThatCreditCardValidatorCanGetLengthOfNumber() {
        assertSame(16, CreditCardNumberValidator.getSize(4388576018410707L));
    }
}