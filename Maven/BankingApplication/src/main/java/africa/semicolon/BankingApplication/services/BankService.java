package africa.semicolon.BankingApplication.services;

import africa.semicolon.BankingApplication.data.models.Bank;

import java.util.List;

public interface BankService {
    String createBank(String bankName);
    List<Bank> findAllBanks();
}
