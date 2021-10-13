package africa.semicolon.BankingApplication.services;

import africa.semicolon.BankingApplication.data.models.Bank;
import africa.semicolon.BankingApplication.data.repositories.BankRepository;
import africa.semicolon.BankingApplication.data.repositories.BankRepositoryImpl;

import java.util.List;

public class BankServiceImpl implements BankService {
    private BankRepository bankRepository = new BankRepositoryImpl();
    private static int lastBankIdCreated = 0;

    @Override
    public String createBank(String bankName) {
        Bank bank = new Bank(String.format("%02d", ++lastBankIdCreated));
        bank.setName(bankName);
        Bank savedBank = bankRepository.save(bank);
        return savedBank.getId();
    }

    @Override
    public List<Bank> findAllBanks() {
        return bankRepository.findAll();
    }
}
