package services;

import models.ContaBancaria;

import javax.swing.JOptionPane;

public class TransacoesConta {
    public static void transacao(ContaBancaria conta) {
        String[] opcoes = { "Depositar", "Sacar" };

        int opcao = JOptionPane.showOptionDialog(null, "Selecione a transação que deseja realizar",
                "Transação", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, opcoes, opcoes[0]);

        switch (opcao) {
            case 0:
                depositar(conta);
                break;
            case 1:
                sacar(conta);
                break;
        }
    }

    public static void depositar(ContaBancaria conta) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Informe o valor que deseja depositar."));

        do {
            if (valor < 10) {
                valor = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Não é possível depositar menos de R$ 10,00. Tente novamente."));
            }
        } while (valor < 10);

        double saldoAtual = conta.getSaldo();
        conta.setSaldo(valor + saldoAtual);
    }

    public static void sacar(ContaBancaria conta) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Informe o valor que deseja sacar."));

        double saldoAtual = conta.getSaldo();

        do {
            if (valor > saldoAtual) {
                valor = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Valor indisponível. Tente novamente."));
            }
        } while (valor > saldoAtual);

        conta.setSaldo(saldoAtual - valor);
    }
}