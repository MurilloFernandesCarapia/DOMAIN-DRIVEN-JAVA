package br.com.fiap;

public class UsaColheitadeira {
    public static void main(String[] args) {
        Colheitadeira colheitadeira = new Colheitadeira();
        colheitadeira.motor = "Desligado";
        colheitadeira.plataformadeCorte = "Desligado";
        colheitadeira.velocidade = 0;
        colheitadeira.estadoMotor("Ligado");
        colheitadeira.estadoPcorte("Ligado");
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        colheitadeira.aumentarVelocidade();
        System.out.println("Informações de sistema da colheitadeira:");

        System.out.println("Velocidade Atual: " + colheitadeira.velocidade + "\nSituação Motor: " + colheitadeira.motor + "\nSituação Plataforma de Corte: " + colheitadeira.plataformadeCorte);



    }
}
