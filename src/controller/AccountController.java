package controller;

import builder.AccountBuilder;
import model.AccountDTO;
import service.AccountService;
import service.UtilService;
import serviceImpl.AccountServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AccountController {
    AccountService accountService;
    public AccountController(){
        this.accountService= AccountServiceImpl.getInstance();
    }
    public String createAccount(Scanner sc) {
        System.out.println("계좌 id(숫자로 입력),계좌 번호(숫자로 입력), 계좌 소유자 이름을 입력하세요.");
        return accountService.createAccount(new AccountBuilder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(0)
                .transactionDate(Date.from(LocalDateTime.now().toInstant(ZoneOffset.UTC)))
                .build());
    }

    public String deposit(Scanner sc) {
        System.out.println("계좌 번호, 입금 금액 입력:");
        return accountService.deposit(new AccountBuilder()
                .accountNumber(sc.next())
                .balance(sc.nextDouble())
                .build());
    }
    public String withdraw(Scanner sc) {
        System.out.println("계좌번호, 출금 금액 입력: ");
        return accountService.withdraw(new AccountBuilder()
                .accountNumber(sc.next())
                .balance(sc.nextDouble())
                .build());
    }
    public String getBalance(Scanner sc) {
        System.out.println("계좌번호 입력:");
        return accountService.getBalance(sc.next());
    }
    public String cancelAccount(Scanner sc) {
        System.out.println("계좌번호 입력:");
        return accountService.cancelAccount(sc.next());
    }
    public AccountDTO getAccountList(Scanner sc) {
        System.out.println("계좌번호 입력:");
        return accountService.getAccountList(sc.next());
    }
    public List<AccountDTO> getAccount() {
        return accountService.getAccount();
    }
}
