package br.com.fiap.bean;

public class ContaPoupanca extends ContaBancaria{
    private int diaDeRendimento;

    //construtor

    public ContaPoupanca() {
    }

    public ContaPoupanca(String cliente, int numConta, float saldo, int diaDeRendimento) {
        super(cliente, numConta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }

    //metodo getters/setters

    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }

    //metodos de classe(particulares)
    public float novoSaldo(float rendimento){
        return ((rendimento/100) * super.getSaldo()) + super.getSaldo();
    }
}
