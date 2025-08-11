package br.com.fiap.bean;

public class Retangulo extends Quadrado {
    //atributos
    private float altura;

    //construtores
    public Retangulo(){

    }

    public Retangulo(float lado, float altura) {
        super(lado); //super.setLado(lado)
        this.altura = altura;

    }

    //metodos getters/setters

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //metodos particulares da classe
    public float calcularArea(){
        return altura * super.getLado();
    }
}
