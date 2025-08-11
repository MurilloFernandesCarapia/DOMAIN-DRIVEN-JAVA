//RM 564969, Nome: Murillo Fernandes Carapia
//RM 562992, Nome: Leonardo Zerbinatti de Sales


package br.com.fiap.bean;

public class DespesaFamiliar {

    //atributos
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;

    //metodos
    public double calcularTotalDeDespesas() {
        double gastos, academia, totalDespesas;
        gastos = gastoComLuz + gastoComAgua + gastoComInternet;
        academia = valorMensalidadeDaAcademia * numeroDeMoradores;
        totalDespesas = gastos + academia;
        return totalDespesas;
    }
    public double calcularRendaFamiliarLiquida() {
        double rendaLiquida;
        rendaLiquida = rendaFamiliar - calcularTotalDeDespesas();
        return rendaLiquida;

    }


}
