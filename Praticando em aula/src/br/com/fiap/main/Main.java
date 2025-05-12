package br.com.fiap.main;

import br.com.fiap.bean.ContaBancaria;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String auxiliar, cliente, escolha = "sim";
        int numConta, opcao, opcao1;
        float saldo, valorSacar1, valorDepositar1;


        while (escolha.equalsIgnoreCase("sim")) {
           try {
               auxiliar = JOptionPane.showInputDialog("Qual é o seu tipo de conta? \n (1) Conta Bancária \n (2) Conta Poupança \n (3) Conta Especial \n");
               opcao = Integer.parseInt(auxiliar);

               switch (opcao){

                   case 1:
                       cliente = JOptionPane.showInputDialog("Qual o nome do titular da conta? ");
                       auxiliar = JOptionPane.showInputDialog("Qual é o número da conta? ");
                       numConta = Integer.parseInt(auxiliar);
                       auxiliar = JOptionPane.showInputDialog("Qual é o saldo da conta? ");
                       saldo = Float.parseFloat(auxiliar);
                       auxiliar = JOptionPane.showInputDialog("Qual opção voce busca? (1) Sacar ou (2) Depositar. \n");
                       opcao1 = Integer.parseInt(auxiliar);

                       switch (opcao1){
                           case 1:
                               System.out.println("Você escolheu a opção Sacar!");
                               JOptionPane.showInputDialog("Qual valor voce deseja sacar?");
                               valorSacar1= Float.parseFloat(auxiliar);
                               ContaBancaria banc = new ContaBancaria();
                               float v1;
                               v1 = banc.sacar(valorSacar1);
                               JOptionPane.showMessageDialog(null, String.format("O nome do titular é %s \nO número da conta é %d \nO saldo da conta é de R$%2.f \n\n O valor atual da conta é de R$%2.f", cliente, numConta, saldo, v1));

                           case 2:
                               System.out.println("Você escolheu a opção Depósito!");
                               auxiliar = JOptionPane.showInputDialog("Qual valor voce deseja depositar?");
                               valorDepositar1= Float.parseFloat(auxiliar);
                               ContaBancaria banco = new ContaBancaria();
                               float v2;
                               v2 = banco.depositar(valorDepositar1);
                               JOptionPane.showMessageDialog(null, String.format("O nome do titular é %s \nO número da conta é %d \nO saldo da conta é de R$%2.f \n\n O valor atual da conta é de R$%2.f", cliente, numConta, saldo, v2));
                       }


                   case 2:
                       cliente = JOptionPane.showInputDialog("Qual o nome do titular da conta? ");
                       auxiliar = JOptionPane.showInputDialog("Qual é o número da conta? ");
                       numConta = Integer.parseInt(auxiliar);
                       auxiliar = JOptionPane.showInputDialog("Qual é o saldo da conta? ");
                       saldo = Float.parseFloat(auxiliar);
               }

           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Formato inválido!!!");
           }


        }

    }
}
