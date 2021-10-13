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

    @Test
    void bankCanCreateAccountForCustomers_test() {
        String gtCoId = bankService.createBank("GTCO");
        String accountNumber = bankService.createAccount("01", "Agba", "Mon-shure");

        assertEquals("010000001", accountNumber);
    }

    @Test
    void createTwoAccountsInBank1_accountNumberShouldBe02() {
        String gtCoId = bankService.createBank("GTCO");

        String agbaAccountNumber = bankService.createAccount("01", "Agba", "Mon-shure");
        String ajohnneAccountNumber = bankService.createAccount("01", "Ajohnne", "LogicOverflow");

        assertEquals("0100000001", agbaAccountNumber);
        assertEquals("0100000002", ajohnneAccountNumber);
    }

    @Test
    void createTwoAccountsInBank1_andOneAccountsInBank2_accountNumberShouldBe01() {
        String gtCoId = bankService.createBank("GTCO");
        String secondBankId = bankService.createBank("First Bank");

        String agbaAccountNumber = bankService.createAccount(gtCoId, "Agba", "Mon-shure");
        String ajohnneAccountNumber = bankService.createAccount(gtCoId, "Ajohnne", "LogicOverflow");
        String jerryAccountNumber = bankService.createAccount(secondBankId, "Ajerry", "BigFowl");

        assertEquals("0100000001", agbaAccountNumber);
        assertEquals("0100000002", ajohnneAccountNumber);
        assertEquals("0200000001", jerryAccountNumber);
    }
}