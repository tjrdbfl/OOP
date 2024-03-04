package serviceImpl;

import model.Account;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;
public class AccountServiceImpl implements AccountService {
    private static AccountService instance= new AccountServiceImpl();
    List<Account> list;
    public AccountServiceImpl() {
        list = new ArrayList<Account>();
    }

    public static AccountService getInstance() {
        return instance;
    }

    @Override
    public String createAccount(Account accountDTO) {
        Account account = null;

        list.add(accountDTO);
        for(Account i:list){
            if(i.getAccountNumber().equals(accountDTO.getAccountNumber()))
                account=i;
        }

        return "계좌생성: "+account;
    }
    @Override
    public String deposit(Account accountDTO) {
        Account account = null;

        for(Account i:list){
            if(i.getAccountNumber().equals(accountDTO.getAccountNumber())){
                i.setBalance(i.getBalance()+accountDTO.getBalance());
                account=i;
            }
        }
        return "입금된 금액: "+account.getBalance();
    }
    @Override
    public String withdraw(Account accountDTO) {
        Account account = null;
        String msg="";

        for(Account i:list){
            if(i.getAccountNumber().equals(accountDTO.getAccountNumber())){
                double balance=i.getBalance()-accountDTO.getBalance();
                account=i;
                if(balance<0)
                    msg="잔액 부족";
                else {
                    i.setBalance(balance);
                    msg="잔액: "+account.getBalance();
                }
            }
        }
        return msg;
    }
    @Override
    public String getBalance(String accountNumber) {
        Account account = null;

        for(Account i:list){
            if(i.getAccountNumber().equals(accountNumber))
                account=i;
        }
        return "잔액:" +account.getBalance();
    }

    @Override
    public String cancelAccount(String accountNumber) {
        for(int i=0;i<list.size();i++){
            if(list.get(i).getAccountNumber().equals(accountNumber)){
                list.remove(i);
            }
        }
        return "계좌 탈퇴 성공";
    }

    @Override
    public Account getAccountList(String accountNumber) {
        Account account = null;

        for(Account i:list){
            if(i.getAccountNumber().equals(accountNumber))
                account=i;
        }
        return account;
    }

    @Override
    public List<Account> getAccount() {
        return list;
    }
}
