package model;

public class ContaCorrente extends Conta{

    public double getLimite() {
        return limite;
    }
    private double limite;

    public ContaCorrente(int numConta, Cliente cliente, double limite){
        super(numConta, cliente);
        this.limite = limite;
        }

    @Override
    public void sacar(double valor) {
        if(valor > 0 && saldo - valor >= -limite) {
            saldo -= valor;
          }
        }

}


