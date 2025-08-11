package br.com.fiap;

public class UsaArcondicionado {
    public static void main(String[] args) {
        Arcondicionado ar = new Arcondicionado();
        ar.modo = "Aquecer";
        ar.temperatura = 31;
        ar.trocarModo("Resfriar");
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        System.out.println("Modo de Ar Atual: " + ar.modo + "\nTemperatura Atual: " + ar.temperatura);
    }
}
