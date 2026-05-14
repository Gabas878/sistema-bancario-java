package model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numConta, Cliente cliente) {
        super(numConta, cliente);
    }

    @Override
    public void sacar(double valor) {
        if(valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }

}

