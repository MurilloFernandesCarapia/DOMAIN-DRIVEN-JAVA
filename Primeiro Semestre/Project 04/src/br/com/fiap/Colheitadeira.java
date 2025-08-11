package br.com.fiap;

public class Colheitadeira {
    //atributos
    public int velocidade;
    public String motor;
    public String plataformadeCorte;
    //metodos
    public void aumentarVelocidade(){
        velocidade++;
    }
    public void diminuirVelocidade(){
        velocidade--;
    }
    public void estadoMotor(String energiam){
        motor = energiam;
    }
    public void estadoPcorte(String energiap){
        plataformadeCorte = energiap;
    }
}
