package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import javax.swing.*;

public class MainJOptionPane {
    public static void main(String[] args) {
        DespesaFamiliar desp = new DespesaFamiliar();
        double rendaFamiliar, gastoComLuz, gastoComAgua, gastoComInternet, valorMensalidadeDaAcademia;
        int numeroDeMoradores;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Qual a sua Renda familiar total?");
            rendaFamiliar = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual é a quantidade de moradores em sua residência?");
            numeroDeMoradores = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual é o valor gasto com luz mensalmente?");
            gastoComLuz = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual é o valor gasto com água mensalmente?");
            gastoComAgua = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual é o valor gasto mensalmente com a rede de internet?");
            gastoComInternet = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual é o valor da mensalidade da academia?");
            valorMensalidadeDaAcademia = Double.parseDouble(auxiliar);
            // atribuir os valores ao objeto
            desp.rendaFamiliar = rendaFamiliar;
            desp.numeroDeMoradores = numeroDeMoradores;
            desp.gastoComLuz = gastoComLuz;
            desp.gastoComAgua = gastoComAgua;
            desp.gastoComInternet = gastoComInternet;
            desp.valorMensalidadeDaAcademia  = valorMensalidadeDaAcademia;
            String mensagem = String.format("O valor total da Renda Familiar é de: R$ %.3f \n O total gasto com despesas dessa família é de : R$ %.3f \n O valor da renda familiar líquida é de: R$ %.3f ", desp.rendaFamiliar , desp.calcularTotalDeDespesas(), desp.calcularRendaFamiliarLiquida());
            JOptionPane.showMessageDialog(null, mensagem);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto");
        }
    }
}
