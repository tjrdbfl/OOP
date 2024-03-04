package service;

import model.Account;

import java.util.List;

public interface AccountService {
    String createAccount(Account accountDTO);
    String deposit(Account accountDTO);
    String withdraw(Account accountDTO);
    String getBalance(String accountNumber);
    String cancelAccount(String accountNumber);

    Account getAccountList(String sc);

    List<Account> getAccount();
}
