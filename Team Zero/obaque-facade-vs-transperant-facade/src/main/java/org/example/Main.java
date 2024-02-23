package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Transperant facade
        TransperantBankingFacade tansperantBankingFacade = new TransperantBankingFacade();
        tansperantBankingFacade.getAccount().deposit(1000);
        tansperantBankingFacade.getAccount().withdraw(500);
        tansperantBankingFacade.getTransaction().transfer(new Account(), new Account(), 200);


        // Obaque facade
        ObaqueBankingFacade obaqueBankingFacade = new ObaqueBankingFacade();
        obaqueBankingFacade.checkBalance();
        obaqueBankingFacade.deposit(1000);
        obaqueBankingFacade.withdraw(500);
        Account fromAccount = new Account();
        Account toAccount = new Account();
        obaqueBankingFacade.transfer(fromAccount, toAccount, 200);
    }
}