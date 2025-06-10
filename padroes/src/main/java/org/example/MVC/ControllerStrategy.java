package org.example.MVC;

public interface ControllerStrategy {
    void addConta(String nome, double saldo);
    void atualizarSaldo(String nome, double saldo);
}
