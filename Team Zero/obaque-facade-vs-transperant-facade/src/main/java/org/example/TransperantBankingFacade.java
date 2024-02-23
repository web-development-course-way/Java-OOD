package org.example;

class TransperantBankingFacade {
    private Account account;
    private Transaction transaction;

    public TransperantBankingFacade() {
        this.account = new Account();
        this.transaction = new Transaction();
    }

    public Account getAccount() {
        return account;
    }

    public Transaction getTransaction() {
        return transaction;
    }
}
