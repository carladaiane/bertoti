package org.example.MVC;

public class ControllerReadOnly implements ControllerStrategy {
    private ContaModel model;

    public ControllerReadOnly(ContaModel model) {
        this.model = model;
    }

    @Override
    public void addConta(String nome, double saldo) {

        System.out.println("Adição de conta não permitida no modo ReadOnly.");
    }

    @Override
    public void atualizarSaldo(String nome, double saldo) {
        model.atualizarSaldo(nome, saldo);
    }
}
