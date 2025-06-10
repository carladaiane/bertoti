package org.example.MVC;

import java.util.ArrayList;
import java.util.List;

public class ContaModel {
    private ContaComposite rootConta = new ContaComposite("Contas");
    private List<ContaModelObserver> observers = new ArrayList<>();

    public ContaComposite getRootConta() {
        return rootConta;
    }

    public void addObserver(ContaModelObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ContaModelObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (ContaModelObserver obs : observers) {
            obs.update();
        }
    }

    public void addConta(String nome, double saldo) {
        ContaLeaf novaConta = new ContaLeaf(nome, saldo);
        rootConta.addConta(novaConta);
        notifyObservers();
    }

    public void atualizarSaldo(String nome, double novoSaldo) {
        ContaLeaf conta = encontrarContaLeafPorNome(nome);
        if (conta != null) {
            conta.setSaldo(novoSaldo);
            notifyObservers();
        }
    }

    private ContaLeaf encontrarContaLeafPorNome(String nome) {
        for (int i = 0; i < rootConta.getContasCount(); i++) {
            Conta c = rootConta.getConta(i);
            if (c instanceof ContaLeaf && c.getNome().equals(nome)) {
                return (ContaLeaf) c;
            }
        }
        return null;
    }
}
