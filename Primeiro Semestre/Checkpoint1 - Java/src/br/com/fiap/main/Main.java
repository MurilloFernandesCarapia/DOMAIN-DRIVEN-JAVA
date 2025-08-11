//RM 564969, Nome: Murillo Fernandes Carapia
//RM 562992, Nome: Leonardo Zerbinatti de Sales


package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // atribuições do metodo Scanner

        double rendaFamiliar, gastoComLuz, gastoComAgua, gastoComInternet, valorMensalidadeDaAcademia;
        int numeroDeMoradores;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a sua Renda familiar total?: ");
        rendaFamiliar = sc.nextDouble();
        System.out.println("Qual é a quantidade de moradores em sua residência?: ");
        numeroDeMoradores = sc.nextInt();
        System.out.println("Qual é o valor gasto com luz mensalmente?: ");
        gastoComLuz = sc.nextDouble();
        System.out.println("Qual é o valor gasto com água mensalmente?: ");
        gastoComAgua = sc.nextDouble();
        System.out.println("Qual é o valor gasto mensalmente com a rede de internet?: ");
        gastoComInternet = sc.nextDouble();
        System.out.println("Qual é o valor da mensalidade da academia?: ");
        valorMensalidadeDaAcademia = sc.nextDouble();

        //atribuições do objeto da classe DespesaFamiliar

        DespesaFamiliar desp = new DespesaFamiliar();
        desp.rendaFamiliar = rendaFamiliar;
        desp.numeroDeMoradores = numeroDeMoradores;
        desp.gastoComLuz = gastoComLuz;
        desp.gastoComAgua = gastoComAgua;
        desp.gastoComInternet = gastoComInternet;
        desp.valorMensalidadeDaAcademia  = valorMensalidadeDaAcademia;

        System.out.printf("O valor total da Renda Familiar é de: R$ %.3f \n O total gasto com despesas dessa família é de : R$ %.3f \n O valor da renda familiar líquida é de: R$ %.3f ", desp.rendaFamiliar , desp.calcularTotalDeDespesas(), desp.calcularRendaFamiliarLiquida());
    }
}
