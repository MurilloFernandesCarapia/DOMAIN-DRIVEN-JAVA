package br.com.fiap.bean;

public class ContaEspecial extends ContaBancaria{
    // atributos
    private float limite;

    //contrutores


    public ContaEspecial() {
    }

    public ContaEspecial(String cliente, int numConta, float saldo, float limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    //método getters/setters

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    //metodos de classe (particulares)
    public float sacar(float valor){
        return super.getSaldo() - valor;

    }


}
