package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;
import br.com.fiap.bean.Vendedor;
import br.com.fiap.bean.VigiaNoturno;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String auxiliar, escolha ="sim", nome;
        float comissao, valorHoraTrabalhada, adicionalNoturno, salario;
        int opcao;

        while(escolha.equalsIgnoreCase("sim")){
            try {
                auxiliar = JOptionPane.showInputDialog("(1) Funcionário \n (2) Vigia Noturno \n (3) Vendedor");
                opcao = Integer.parseInt(auxiliar);

                switch (opcao){
                    case 1:
                        nome = JOptionPane.showInputDialog("Qual é o nome do Funcionário?");
                        auxiliar = JOptionPane.showInputDialog("Qual o valor da hora trabalhada?");
                        valorHoraTrabalhada = Float.parseFloat(auxiliar);
                        Funcionario func = new Funcionario(nome, valorHoraTrabalhada);
                        salario = func.calcularSalario();
                        JOptionPane.showMessageDialog(null, String.format("O nome do funcionário é %s \nO Salário é de R$%.2f", nome, salario));

                        break;

                    case 2:
                        nome = JOptionPane.showInputDialog("Qual é o nome do Vigia Noturno?");
                        auxiliar = JOptionPane.showInputDialog("Qual o valor da hora trabalhada?");
                        valorHoraTrabalhada = Float.parseFloat(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Qual o valor do adicional noturno?");
                        adicionalNoturno = Float.parseFloat(auxiliar);
                        VigiaNoturno vigia = new VigiaNoturno(nome, valorHoraTrabalhada, adicionalNoturno);
                        salario = vigia.calcularSalario();
                        JOptionPane.showMessageDialog(null, String.format("O nome do Vigia Noturno é %s \n O salário do Vigia é R$%.2f", nome, salario));

                        break;

                    case 3:
                        nome = JOptionPane.showInputDialog("Qual é o nome do Vendedor?");
                        auxiliar = JOptionPane.showInputDialog("Qual o valor da hora trabalhada?");
                        valorHoraTrabalhada = Float.parseFloat(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Qual o valor da comissão?");
                        comissao = Float.parseFloat(auxiliar);
                        Vendedor venda = new Vendedor(nome, valorHoraTrabalhada, comissao);
                        salario = venda.calcularSalario();
                        JOptionPane.showMessageDialog(null, String.format("O nome do Vendedor é %s \n O salário do Vendedor é R$%.2f", nome, salario));
                        break;

                    default:
                        throw new Exception("Escolha incorreta");







                }
                escolha = JOptionPane.showInputDialog("Deseja continuar?");




            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Valor incorreto");
            }


        }
        JOptionPane.showMessageDialog(null, "Fim de programa, até a próxima!");




    }
}
