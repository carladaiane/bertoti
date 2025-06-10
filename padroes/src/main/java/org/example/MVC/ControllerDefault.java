package org.example.MVC;

public class ControllerDefault implements ControllerStrategy {
    private ContaModel model;

    public ControllerDefault(ContaModel model) {
        this.model = model;
    }

    @Override
    public void addConta(String nome, double saldo) {
        model.addConta(nome, saldo);
    }

    @Override
    public void atualizarSaldo(String nome, double saldo) {
        model.atualizarSaldo(nome, saldo);
    }
}
