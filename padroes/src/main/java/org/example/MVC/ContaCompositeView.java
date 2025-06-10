package org.example.MVC;

import javax.swing.*;
import java.awt.*;

public class ContaCompositeView extends JPanel implements ContaModelObserver {
    private ContaModel model;

    public ContaCompositeView(ContaModel model) {
        this.model = model;
        model.addObserver(this);
        this.setLayout(new BorderLayout());
        this.update();
    }

    @Override
    public void update() {
        this.removeAll();

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        StringBuilder sb = new StringBuilder();

        desenharConta(model.getRootConta(), sb, 0);

        textArea.setText(sb.toString());
        this.add(new JScrollPane(textArea), BorderLayout.CENTER);

        this.revalidate();
        this.repaint();
    }

    private void desenharConta(Conta conta, StringBuilder sb, int nivel) {
        String indent = "  ".repeat(nivel);
        sb.append(indent)
                .append(conta.getNome())
                .append(" - Saldo: R$ ")
                .append(String.format("%.2f", conta.getSaldo()))
                .append("\n");

        if (conta instanceof ContaComposite) {
            ContaComposite composite = (ContaComposite) conta;
            for (int i = 0; i < composite.getContasCount(); i++) {
                desenharConta(composite.getConta(i), sb, nivel + 1);
            }
        }
    }
}
