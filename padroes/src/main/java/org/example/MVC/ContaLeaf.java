package org.example.MVC;

public class ContaLeaf implements Conta {
    private String nome;
    private double saldo;

    public ContaLeaf(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void addConta(Conta conta) {
        throw new UnsupportedOperationException("ContaLeaf não suporta addConta");
    }
    @Override
    public Conta getConta(int index) {
        throw new UnsupportedOperationException("ContaLeaf não suporta getConta");
    }

    @Override
    public int getContasCount() {
        return 0;
    }
}
