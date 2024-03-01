package service;

import model.AccountDTO;

import java.util.List;

public interface AccountService {
    String createAccount(AccountDTO accountDTO);
    String deposit(AccountDTO accountDTO);
    String withdraw(AccountDTO accountDTO);
    String getBalance(String accountNumber);
    String cancelAccount(String accountNumber);

    AccountDTO getAccountList(String sc);

    List<AccountDTO> getAccount();
}
