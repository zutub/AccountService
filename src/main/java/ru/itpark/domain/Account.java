package ru.itpark.domain;

public class Account {
    private int id;
    private long balance;

    public Account(int id, long balance) {
        this.id = id;
        this.balance = balance;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
