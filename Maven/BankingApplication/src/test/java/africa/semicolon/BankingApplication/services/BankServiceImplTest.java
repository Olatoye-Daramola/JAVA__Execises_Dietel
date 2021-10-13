package africa.semicolon.BankingApplication.services;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankServiceImplTest {
    BankService bankService;

    @BeforeEach
    void setUp() {
        bankService = new BankServiceImpl();
    }

    @AfterEach
    void tearDown() {
        bankService = null;
    }

    @Test
    void createBank() {
        String bankId = bankService.createBank("GTCO");

        assertEquals("01", bankId);
    }

    @Test
    void createTwoBanks_secondBankWillBe02() {
        String gtCoId = bankService.createBank("GTCO");
        String firstBankId = bankService.createBank("FIRST Bank");

        assertEquals("01", gtCoId);
        assertEquals("02", firstBankId);
    }

    @Test
    void createTwoBanks_repositoryShouldHave2Banks() {
        String gtCoId = bankService.createBank("GTCO");
        String firstBankId = bankService.createBank("FIRST Bank");

        assertEquals("01", gtCoId);
        assertEquals("02", firstBankId);
        assertEquals(2, bankService.findAllBanks().size());
    }
}