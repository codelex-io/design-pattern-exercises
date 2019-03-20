package io.codelex.structural.proxy;

class User {
    private int balance;

    User(int balance) {
        this.balance = balance;
    }

    void decrease() {
        this.balance--;
    }

    public int getBalance() {
        return balance;
    }
}
