package model;

public class Conta {

    protected int numConta;
    protected double saldo = 0;
    private Cliente cliente;

    public int getNumeroConta() {
        return this.numConta;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public Conta(int numConta, Cliente cliente) {
        this.numConta = numConta;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {

        if(valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
       if(valor > 0) {
        if (saldo >= valor) {
            saldo -= valor;
        }
       }
    }

    public void transferir(double valor, Conta contaDestino) {
       if(valor > 0) {
        if(saldo >= valor) {
            sacar(valor);
            contaDestino.depositar(valor);
        }
       }
    }

    public String toString() {
        return "Cliente: " + cliente.getNome() + " | " + "Conta: " + numConta + " | " + " Saldo: " + saldo;
    }

}
