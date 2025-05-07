package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import javax.swing.*;

public class MainJOptionPane {
    public static void main(String[] args) {
        DespesaFamiliar desp = new DespesaFamiliar();
        double rendaFamiliar, contaDeLuz, contaDeAgua, planoConvenio, faculdade, iptu, ipva, seguroCarro, mercado, farmacia, academia, fastFood, aulaDeIngles, combustivel, faxineira, vestimenta, planoInternet, petShop, faturaCartao;
        int dependentesDeAcademia, dependentesDeIngles;
        String auxiliar;

        try {
            auxiliar = JOptionPane.showInputDialog("Qual foi a sua Renda Familiar total este mês?");
            rendaFamiliar = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual foi o valor da sua conta de luz este mês?");
            contaDeLuz = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual foi o valor da minha conta de água este mês?");
            contaDeAgua = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual foi o valor total do convenio este mês?");
            planoConvenio = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual foi o valor total dos estudos (Faculdade , escola e etc..) este mês?");
            faculdade = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual foi o valor do IPTU este mês?");
            iptu = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual foi o valor do IPVA (O IPVA é pago anualmente, qual é o valor anual do IPVA de seus veículos?");
            ipva = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual foi o valor do seguro de veículos este mês?");
            seguroCarro = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual foi o valor gasto em mercados e alimentos este mês? (Caso o valor foi gasto em cartões, coloque o valor R$0. Mas não se esqueça que no final irá ter o local para o valor das faturas de cartão!)");
            mercado = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual foi o valor gasto em farmácias este mês? (Caso o valor foi gasto em cartões, coloque o valor R$0. Mas não se esqueça que no final irá ter o local para o valor das faturas de cartão!)");
            farmacia = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual é o valor de seu plano de academia? (Caso não faça, Digite o valor '0') ");
            academia = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Quantas pessoas da família são dependentes desse plano de academia? (Caso não faça, Digite o valor '0') ");
            dependentesDeAcademia = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual foi o valor gasto com Fast-Foods e Restaurantes este mês?");
            fastFood = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual valor das aulas de ingles? (Caso não faça, Digite o valor '0') ");
            aulaDeIngles = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Quantas pessoas fazem aula de ingles? (Caso não faça, Digite o valor '0')");
            dependentesDeIngles = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual o valor gasto com combustível este mês?");
            combustivel = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual o valor gasto com faxineiras este mês?");
            faxineira = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual o valor gasto com vestimentas este mês?");
            vestimenta = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual o valor gasto com plano de internet este mês?");
            planoInternet = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual o valor gasto com petshop este mês?");
            petShop = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual o valor da fatura de cartão este mês?");
            faturaCartao = Double.parseDouble(auxiliar);

            // atribuições ao objeto
            desp.rendaFamiliar = rendaFamiliar;
            desp.contaDeLuz = contaDeLuz;
            desp.contaDeAgua = contaDeAgua;
            desp.planoConvenio = planoConvenio;
            desp.faculdade = faculdade;
            desp.iptu = iptu;
            desp.ipva = ipva;
            desp.seguroCarro = seguroCarro;
            desp.mercado = mercado;
            desp.farmacia = farmacia;
            desp.academia = academia;
            desp.dependentesDeAcademia = dependentesDeAcademia;
            desp.fastFood = fastFood;
            desp.aulaDeIngles = aulaDeIngles;
            desp.dependentesDeIngles = dependentesDeIngles;
            desp.combustivel = combustivel;
            desp.faxineira = faxineira;
            desp.vestimenta = vestimenta;
            desp.planoInternet = planoInternet;
            desp.petShop = petShop;
            desp.faturaCartao = faturaCartao;

            String mensagem = String.format("O valor da renda familiar é de: R$ %.2f \n Está família teve um total de R$ %.2f despesas este mes \n A renda líquida ou restante da família este mes é de : R$ %.2f \n É de sugestão que guarde R$ %.2f em um cofrinho!" , desp.rendaFamiliar , desp.calcularTotalDeDespesas(), desp.calcularRendaLiquida(), desp.calcularEconomiaMensal());
            JOptionPane.showMessageDialog(null, mensagem);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto");


        }


    }
}
