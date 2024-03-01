package view;

import controller.AccountController;

import java.util.Scanner;

public class AccountView {
    public static void main(Scanner sc) {
        AccountController accountController = new AccountController();

        while (true) {
            System.out.print("\n[Account]\n " +
                    "---------------------\n " +
                    "0-Exit\n " +
                    "1-CreateAccount\n " +
                    "2-Deposit\n " +
                    "3-Withdraw\n " +
                    "4-Balance\n " +
                    "5-RemoveAccount\n " +
                    "6-GetAccountList\n " +
                    "7-getAccount\n " +
                    "---------------------\n" +
                    "입력: ");

            switch (sc.next()) {
                case "0":
                    System.out.println("Exit");
                    return;
                case "1":
                    System.out.println(accountController.createAccount(sc));
                    break;
                case "2":
                    System.out.println(accountController.deposit(sc));
                    break;
                case "3":
                    System.out.println(accountController.withdraw(sc));
                    break;
                case "4":
                    System.out.println(accountController.getBalance(sc));
                    break;
                case "5":
                    System.out.println(accountController.cancelAccount(sc));
                    break;
                case "6":
                    System.out.println(accountController.getAccountList(sc));
                    break;
                case "7":
                    accountController.getAccount().forEach(i -> {
                        System.out.println(i.toString());
                    });
                    break;
            }
        }
    }
}
