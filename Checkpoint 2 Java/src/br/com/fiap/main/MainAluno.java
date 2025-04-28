// Murillo Fernandes Carapia, RM:564969
// Leonardo Zerbinatti de Sales, RM: 562992
// Gustavo Mendes da Rosa Moreira, RM:565807
// Luiz Gustavo Guedes, RM: 565843


package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;
import java.time.LocalDate;

public class MainAluno {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno(565843, "Luiz", 2003);
        Aluno aluno4 = new Aluno(565807, "Gustavo", 2006);

        String nomeAluno1, nomeAluno2, auxiliar;
        int anoDeNascimento1, anoDeNascimento2, registroMatricula1, registroMatricula2;

        LocalDate dataAtual = LocalDate.now();

        try {
            nomeAluno1 = JOptionPane.showInputDialog("Digite o Nome do Aluno 1:");
            auxiliar = JOptionPane.showInputDialog("Digite o ano de nascimento do Aluno 1:");
            anoDeNascimento1 = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o registro da matrícula do Aluno 1:");
            registroMatricula1 = Integer.parseInt(auxiliar);

            nomeAluno2 = JOptionPane.showInputDialog("Digite o Nome do Aluno 2:");
            auxiliar = JOptionPane.showInputDialog("Digite o ano de nascimento do Aluno 2:");
            anoDeNascimento2 = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o registro da matrícula do Aluno 2:");
            registroMatricula2 = Integer.parseInt(auxiliar);

            // Setando os dados
            aluno1.setNomeCompleto(nomeAluno1);
            aluno1.setAnoDeNascimento(anoDeNascimento1);
            aluno1.setRegistroMatricula(registroMatricula1);

            aluno2.setNomeCompleto(nomeAluno2);
            aluno2.setAnoDeNascimento(anoDeNascimento2);
            aluno2.setRegistroMatricula(registroMatricula2);

            // Montando mensagens
            String mensagem1 = String.format("Aluno 1 \nNome: %s \nIdade: %d \nRM: %d",
                    aluno1.getNomeCompleto(), aluno1.calcularIdade(dataAtual), aluno1.getRegistroMatricula());

            String mensagem2 = String.format("Aluno 2 \nNome: %s \nIdade: %d \nRM: %d",
                    aluno2.getNomeCompleto(), aluno2.calcularIdade(dataAtual), aluno2.getRegistroMatricula());

            String mensagem3 = String.format("Aluno 3 \nNome: %s \nIdade: %d \nRM: %d",
                    aluno3.getNomeCompleto(), aluno3.calcularIdade(dataAtual), aluno3.getRegistroMatricula());

            String mensagem4 = String.format("Aluno 4 \nNome: %s \nIdade: %d \nRM: %d",
                    aluno4.getNomeCompleto(), aluno4.calcularIdade(dataAtual), aluno4.getRegistroMatricula());

            // Exibindo com JOptionPane
            JOptionPane.showMessageDialog(null, mensagem1);
            JOptionPane.showMessageDialog(null, mensagem2);
            JOptionPane.showMessageDialog(null, mensagem3);
            JOptionPane.showMessageDialog(null, mensagem4);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto");
        }
    }
}
