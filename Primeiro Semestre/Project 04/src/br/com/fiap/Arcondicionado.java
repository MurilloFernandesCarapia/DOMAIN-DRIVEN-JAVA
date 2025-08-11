package br.com.fiap;

public class Arcondicionado {
   // atributos
    public int temperatura;
    public String modo;
    // metodos
    public void aumentarTemperatura(){
        temperatura++;
    }
    public void diminuirTemperatura(){
        temperatura--;
    }
    public void trocarModo(String novoModo){
        modo = novoModo;
    }


}
