package org.example.MVC;

import java.util.ArrayList;
import java.util.List;

public class ContaComposite implements Conta {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public ContaComposite(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getSaldo() {
        double total = 0;
        for (Conta c : contas) {
            total += c.getSaldo();
        }
        return total;
    }

    @Override
    public void setSaldo(double saldo) {
    }

    @Override
    public void addConta(Conta conta) {
        contas.add(conta);
    }

    @Override
    public Conta getConta(int index) {
        return contas.get(index);
    }

    @Override
    public int getContasCount() {
        return contas.size();
    }
}
