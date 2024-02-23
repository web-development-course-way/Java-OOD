package org.example;

class ObaqueBankingFacade {
    private Account account;
    private Transaction transaction;

    public ObaqueBankingFacade() {
        this.account = new Account();
        this.transaction = new Transaction();
    }

    public void checkBalance() {
        account.checkBalance();
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void transfer(Account fromAccount, Account toAccount, double amount) {
        transaction.transfer(fromAccount, toAccount, amount);
    }

    public void performTransaction(Account account, double amount) {
        transaction.performTransaction(account, amount);
    }
}