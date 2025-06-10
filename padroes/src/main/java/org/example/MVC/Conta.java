package org.example.MVC;

public interface Conta {
    String getNome();
    double getSaldo();
    void setSaldo(double saldo);
    void addConta(Conta conta);
    Conta getConta(int index);
    int getContasCount();
}
