package org.example;

class Transaction {
    public void transfer(Account fromAccount, Account toAccount, double amount) {
        if (fromAccount != null && toAccount != null) {
            if (fromAccount.balance >= amount) {
                fromAccount.balance -= amount;
                toAccount.balance += amount;
                System.out.println("Transferred: $" + amount + " from " + fromAccount + " to " + toAccount);
            } else {
                System.out.println("Insufficient funds in " + fromAccount);
            }
        } else {
            System.out.println("Invalid accounts");
        }
        fromAccount.checkBalance();
        toAccount.checkBalance();
    }

    public void performTransaction(Account account, double amount) {
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Invalid account");
        }
    }
}