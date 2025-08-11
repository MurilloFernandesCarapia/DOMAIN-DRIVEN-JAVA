package br.com.fiap.bean;

public class ContaBancaria {

    //atributos
    private String cliente;
    private int numConta;
    private float saldo;

    //construtores


    public ContaBancaria() {
    }

    public ContaBancaria(String cliente, int numConta, float saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    //métodos getters/setters

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //métodos
    public float sacar(float valor){
        return saldo - valor;
    }
    public float depositar(float valor){
        return saldo + valor;

    }
}
