package br.com.fiap.main;

import javax.swing.*;

public class Atividade {
    public static void main(String[] args) {
        String frase, frase1, frase2;

        try{
            frase = JOptionPane.showInputDialog("Digite a frase que você quiser:");
            String mensagem = String.format("Frase: %s \n Quantidade de caractéres: %d \n Frase inteira em Maiúsculo: %s", frase, frase.length(), frase.toUpperCase());


            JOptionPane.showMessageDialog(null, mensagem);

            frase1 = JOptionPane.showInputDialog("Digite a palavra da frase que você quer substituir: ");
            frase2 = JOptionPane.showInputDialog("Digite por qual palavra você quer substituir.");
            JOptionPane.showMessageDialog(null, frase.replace(frase1,frase2));

        } catch (Exception e) {

        }

    }
}