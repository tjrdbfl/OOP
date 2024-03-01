package serviceImpl;

import model.AccountDTO;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class AccountServiceImpl implements AccountService {
    private static AccountService instance= new AccountServiceImpl();
    List<AccountDTO> list;

    public AccountServiceImpl() {
        list = new ArrayList<>();
    }

    public static AccountService getInstance() {
        return instance;
    }

    @Override
    public String createAccount(AccountDTO accountDTO) {
        AccountDTO account = null;

        list.add(accountDTO);
        for(AccountDTO i:list){
            if(i.getAccountNumber().equals(accountDTO.getAccountNumber()))
                account=i;
        }

        return "계좌생성: "+account;
    }
    @Override
    public String deposit(AccountDTO accountDTO) {
        AccountDTO account = null;

        for(AccountDTO i:list){
            if(i.getAccountNumber().equals(accountDTO.getAccountNumber())){
                i.setBalance(i.getBalance()+accountDTO.getBalance());
                account=i;
            }
        }
        return "입금된 금액: "+account.getBalance();
    }
    @Override
    public String withdraw(AccountDTO accountDTO) {
        AccountDTO account = null;
        String msg="";

        for(AccountDTO i:list){
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
        AccountDTO account = null;

        for(AccountDTO i:list){
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
    public AccountDTO getAccountList(String accountNumber) {
        AccountDTO account = null;

        for(AccountDTO i:list){
            if(i.getAccountNumber().equals(accountNumber))
                account=i;
        }
        return account;
    }

    @Override
    public List<AccountDTO> getAccount() {
        return list;
    }
}
