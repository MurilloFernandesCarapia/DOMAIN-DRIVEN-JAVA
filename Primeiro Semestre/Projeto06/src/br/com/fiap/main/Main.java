package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FolhaDePagamento pag = new FolhaDePagamento();
        pag.salarioBruto = 10000;
        pag.numeroDeDependentes = 9;
        pag.descontoINSS = 10;
        pag.valorPlanoDeSaude = 200;
        System.out.printf("Salário Bruto: R$ %.2f \nN° de Dependentes: %d \nINSS: %.1f%% \nPlano de Saúde: %.2f \nSalário Líquido: R$ %.2f",pag.salarioBruto, pag.numeroDeDependentes,pag.descontoINSS,pag.valorPlanoDeSaude,pag.calcularSalarioLiquido());

    }
}
