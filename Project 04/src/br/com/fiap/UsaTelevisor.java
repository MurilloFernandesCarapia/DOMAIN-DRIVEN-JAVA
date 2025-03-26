package br.com.fiap;

public class UsaTelevisor {
    public static void main(String[] args) {
        Televisor televisor1;
        televisor1 = new Televisor();
        televisor1.volume = 69;
        televisor1.canal = 520;
        televisor1.trocarCanal(540);
        televisor1.aumentarVolume();
        televisor1.aumentarVolume();
        televisor1.aumentarVolume();
        televisor1.diminuirVolume();
        System.out.println("Canal atual: " + televisor1.canal + "\nVolume atual: " + televisor1.volume);
    }
}
