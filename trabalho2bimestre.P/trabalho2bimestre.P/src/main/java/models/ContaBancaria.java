package models;

public class ContaBancaria {
    public int numConta;
    public String nmTitular;
    public double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(int numConta, String nmTitular, double saldo) {
        this.numConta = numConta;
        this.nmTitular = nmTitular;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNmTitular() {
        return nmTitular;
    }

    public void setNmTitular(String nmTitular) {
        this.nmTitular = nmTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\n" +
                "N°: " + numConta + "\n" +
                "Dono: " + nmTitular + "\n" +
                "Saldo: " + saldo + "\n" + "\n";
    }
}