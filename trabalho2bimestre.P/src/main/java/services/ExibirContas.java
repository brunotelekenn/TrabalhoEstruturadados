package services;

import models.ContaBancaria;

import javax.swing.*;
import java.util.ArrayList;

public class ExibirContas {
public static void exibir(ArrayList<ContaBancaria> contas) {
String[] opcoes = {"Por Saldo", "Por N°"};

int opcao = JOptionPane.showOptionDialog(null, "Selecione um método de ordenação",
"Exibir Contas", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
null, opcoes, opcoes[0]);

int n = contas.size();
boolean troca;

if (opcao == 0) {
for (int i = 0; i < n - 1; i++) {
troca = false;

for (int j = 0; j < n - i - 1; j++) {
if (contas.get(j).getSaldo() > contas.get(j + 1).getSaldo()) {
ContaBancaria temp = contas.get(j);
contas.set(j, contas.get(j + 1));
contas.set(j + 1, temp);
troca = true;
}
}

if (!troca) {
break;
}
}
} else if (opcao == 1) {
for (int i = 0; i < n - 1; i++) {
troca = false;

for (int j = 0; j < n - i - 1; j++) {
if (contas.get(j).getNumConta() > contas.get(j + 1).getNumConta()) {
ContaBancaria temp = contas.get(j);
contas.set(j, contas.get(j + 1));
contas.set(j + 1, temp);
troca = true;
}
}

if (!troca) {
break;
}
}
}

StringBuilder sb = new StringBuilder();
for (ContaBancaria conta : contas) {
sb.append(conta.toString()).append("\n");
}

JOptionPane.showMessageDialog(null, sb.toString(), "Contas Bancárias", JOptionPane.INFORMATION_MESSAGE);
}
}