package CreditCardNumberValidation.test;

import CreditCardNumberValidation.src.CreditCardNumberValidator;
import org.junit.jupiter.api.Test;

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
    void testThatCreditCardNumberLengthOf13And16IsInValidRange() {
        assertTrue(CreditCardNumberValidator.isWithinValidRange(1234567891234L));
        assertTrue(CreditCardNumberValidator.isWithinValidRange(1234567891234567L));
    }

    @Test
    void testThatCreditCardIsAVisaCard() {
        assertEquals(VISA, CreditCardNumberValidator.getCreditCardType();)
    }
}