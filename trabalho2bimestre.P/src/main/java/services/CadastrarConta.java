package services;

import models.ContaBancaria;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CadastrarConta {
public static ArrayList<ContaBancaria> cadastrar() {
ArrayList<ContaBancaria> contas = new ArrayList<>();
String[] opcoesCadastro = {"Confirmar", "Cancelar"};
String[] opcoesMaisUmCadastro = {"Sim", "Nao"};

int novoCadastro = 1;
do {
JPanel panel = new JPanel();
panel.setLayout(new GridLayout(3, 2));


JTextField textField1 = new JTextField();
JTextField textField2 = new JTextField();
JTextField textField3 = new JTextField();

panel.add(new JLabel("N° Conta: "));
panel.add(textField1);
panel.add(new JLabel("Nome do dono: "));
panel.add(textField2);
panel.add(new JLabel("Saldo inicial: "));
panel.add(textField3);

int result = JOptionPane.showOptionDialog(null, panel, "Entrada de Dads",
JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesCadastro, null);

if (result == JOptionPane.OK_OPTION) {
int numConta = Integer.parseInt(textField1.getText());
String nmTitular = textField2.getText();
double saldo = Double.parseDouble(textField3.getText());

ContaBancaria contaBancaria = new ContaBancaria();
contaBancaria.setNumConta(numConta);
contaBancaria.setNmTitular(nmTitular);
contaBancaria.setSaldo(saldo);

contas.add(contaBancaria);
} else {
return contas;
}

novoCadastro = JOptionPane.showOptionDialog(null, null, "Cadastrar mais uma nova conta?",
JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesMaisUmCadastro, null);
} while (novoCadastro == 0);

return contas;
}


}
