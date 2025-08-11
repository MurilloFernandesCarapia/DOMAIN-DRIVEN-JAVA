package br.com.fiap.main;

import javax.swing.*;

public class ComparaString {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Digite sua senha");
        if (senha.equals("P4ssw0rD")){
            JOptionPane.showMessageDialog(null, "Acesso concedido");
        }else {
            JOptionPane.showMessageDialog(null, "Acesso Negado");
        }if (senha.equalsIgnoreCase("P4ssw0rD")){
            JOptionPane.showMessageDialog(null, "Autorizando Acesso");
        }else {
            JOptionPane.showMessageDialog(null, "Proibindo Acesso");
        }
    }
}
