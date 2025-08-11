package br.com.fiap.bean;

public class DespesaFamiliar {

    //atributos

    public double rendaFamiliar;
    public double contaDeLuz;
    public double contaDeAgua;
    public double planoConvenio;
    public double faculdade;
    public double iptu;
    public double ipva;
    public double seguroCarro;
    public double mercado;
    public double farmacia;
    public double academia;
    public int dependentesDeAcademia;
    public double fastFood;
    public double aulaDeIngles;
    public int dependentesDeIngles;
    public double combustivel;
    public double faxineira;
    public double vestimenta;
    public double planoInternet;
    public double petShop;
    public double faturaCartao;

    //metodos

    public double calcularTotalDeDespesas(){
        double gastos, acad, ingles, totalDespesas, iipva;
        gastos = contaDeLuz + contaDeAgua + planoConvenio + faculdade + iptu + seguroCarro + mercado + farmacia + fastFood + combustivel + faxineira + vestimenta + planoInternet + petShop + faturaCartao;
        acad = academia * dependentesDeAcademia;
        ingles = aulaDeIngles * dependentesDeIngles;
        iipva = ipva / 12;
        totalDespesas = gastos + acad + ingles + iipva;
        return totalDespesas;
    }
    public double calcularRendaLiquida(){
        double rendaLiquida;
        rendaLiquida = rendaFamiliar - calcularTotalDeDespesas();
        return rendaLiquida;
    }
    public double calcularEconomiaMensal(){
        double porcentagemEconomia;
        porcentagemEconomia = calcularRendaLiquida() * 0.1;
        return  porcentagemEconomia;
    }
}



