package org.example.MVC;

import javax.swing.*;
import java.awt.*;

public class MVCStrategyObserverComposite {

    private static ContaModel model = new ContaModel();
    private static ControllerStrategy controller = new ControllerDefault(model);

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("MVC + Strategy + Observer + Composite");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(450, 400);
            frame.setLayout(new BorderLayout(10, 10));

            ContaCompositeView view = new ContaCompositeView(model);


            JPanel controlPanel = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);
            gbc.fill = GridBagConstraints.HORIZONTAL;

            JTextField nomeField = new JTextField(15);
            JTextField saldoField = new JTextField(10);
            JButton addButton = new JButton("Adicionar Conta");
            JButton switchControllerButton = new JButton("Trocar Controller");

            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 0;
            controlPanel.add(new JLabel("Nome:"), gbc);

            gbc.gridx = 1;
            gbc.gridy = 0;
            gbc.weightx = 1.0;
            controlPanel.add(nomeField, gbc);

            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.weightx = 0;
            controlPanel.add(new JLabel("Saldo:"), gbc);

            gbc.gridx = 1;
            gbc.gridy = 1;
            gbc.weightx = 1.0;
            controlPanel.add(saldoField, gbc);

            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.gridwidth = 2;
            gbc.weightx = 1.0;
            controlPanel.add(addButton, gbc);

            gbc.gridx = 0;
            gbc.gridy = 3;
            gbc.gridwidth = 2;
            controlPanel.add(switchControllerButton, gbc);

            addButton.addActionListener(e -> {
                String nome = nomeField.getText();
                double saldo;
                try {
                    saldo = Double.parseDouble(saldoField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Saldo inválido!");
                    return;
                }
                controller.addConta(nome, saldo);
            });

            switchControllerButton.addActionListener(e -> {
                if (controller instanceof ControllerDefault) {
                    controller = new ControllerReadOnly(model);
                    JOptionPane.showMessageDialog(frame, "Controller mudou para ReadOnly");
                } else {
                    controller = new ControllerDefault(model);
                    JOptionPane.showMessageDialog(frame, "Controller voltou para Default");
                }
            });

            frame.add(view, BorderLayout.CENTER);
            frame.add(controlPanel, BorderLayout.EAST);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
