package ru.mirea.task26.opt;

public interface PayStrategy
{
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}