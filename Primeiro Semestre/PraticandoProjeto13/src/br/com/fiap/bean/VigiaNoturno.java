package br.com.fiap.bean;

public class VigiaNoturno extends Funcionario{
    //atributos
    private float adicionalNoturno;
    //construtor

    public VigiaNoturno() {
    }

    public VigiaNoturno(String nome, float valorHoraTrabalho, float adicionalNoturno) {
        super(nome, valorHoraTrabalho);
        this.adicionalNoturno = adicionalNoturno;
    }

    //getters/setters

    public float getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(float adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    //metodos de classe (particulares)
    public float calcularSalario(){
        return (adicionalNoturno + ((super.getValorHoraTrabalho() *40) * 4));
    }
}
