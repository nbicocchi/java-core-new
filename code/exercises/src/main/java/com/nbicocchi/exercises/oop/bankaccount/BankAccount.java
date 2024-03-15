package com.nbicocchi.exercises.oop.bankaccount;

/**
 * Defines common features of bank accounts.
 */
public interface BankAccount {
    String getIBAN();

    void setIBAN(String IBAN);

    double getBalance();

    void setBalance(double balance);

    double getOperationFee();

    void setOperationFee(double operationFee);

    double getInterestRate();

    void setInterestRate(double interestRate);

    void deposit(double amount);

    void withdraw(double amount);

    void transfer(BankAccount other, double amount);

    void addInterest();
}
