package br.com.fiap.main;

import br.com.fiap.bean.Quadrado;
import br.com.fiap.bean.Retangulo;
import br.com.fiap.bean.Triangulo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String auxiliar,escolha ="sim";
        float lado,altura,area;
        int opcao;
        while (escolha.equalsIgnoreCase("Sim")){
            try {
                auxiliar = JOptionPane.showInputDialog("Qual área deseja calcular? \n (1) Quadrado \n (2) Retangulo \n (3) Triangulo");
                opcao = Integer.parseInt(auxiliar);

                switch (opcao) {
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do lado: ");
                        lado = Float.parseFloat(auxiliar);
                        Quadrado quad = new Quadrado(lado);
                        area = quad.calcularArea();
                        JOptionPane.showMessageDialog(null, String.format("Área do quadrado: %2f", area));
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do lado: ");
                        lado = Float.parseFloat(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Digite o valor da altura: ");
                        altura = Float.parseFloat(auxiliar);
                        Retangulo retang = new Retangulo(lado, altura);
                        area = retang.calcularArea();
                        JOptionPane.showMessageDialog(null, String.format("Área do retangulo: %2f", area));
                        break;

                    case 3:
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do lado: ");
                        lado = Float.parseFloat(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Digite o valor da altura: ");
                        altura = Float.parseFloat(auxiliar);
                        Triangulo tri = new Triangulo(lado, altura);
                        area = tri.calcularArea();
                        JOptionPane.showMessageDialog(null, String.format("Área do Triangulo: %2f", area));
                        break;
                    default:
                        throw new Exception("Escolha incorreta");

                }
                escolha = JOptionPane.showInputDialog("Deseja continuar?");


            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor incorreto!");
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de Programa, Até a próxima!!!");
    }
}
