package services;

import models.ContaBancaria;

import javax.swing.*;
import java.util.ArrayList;

public class BuscarConta {
    public static ContaBancaria buscar(ArrayList<ContaBancaria> contas) {
        String[] opcoes = {"Buscar por Número da Conta", "Buscar por dono"};

        int opcao = JOptionPane.showOptionDialog(null, "Selecione uma opção de busca",
                "Menu de Opções", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, opcoes, opcoes[0]);

        ContaBancaria contaEncontrada = null;
        switch (opcao) {
            case 0 -> {
                int numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite o número da conta:"));

                for (ContaBancaria conta : contas) {
                    if (conta.getNumConta() == numeroConta) {
                        contaEncontrada = conta;
                    }
                }
            }

            case 1 -> {
                String titular = JOptionPane.showInputDialog(null,
                        "Digite o nome do dono:");

                for (ContaBancaria conta : contas) {
                    if (conta.getNmTitular().equalsIgnoreCase(titular)) {
                        contaEncontrada = conta;
                    }
                }
            }
        }

        return contaEncontrada;
    }
}
