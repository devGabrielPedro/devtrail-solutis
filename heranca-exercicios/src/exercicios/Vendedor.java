package exercicios;

public class Vendedor extends  Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor(int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String nome, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioBaseComImposto = salarioBase - (salarioBase * (imposto / 100));
        double valorComissao = valorVendas * (comissao / 100);
        return salarioBaseComImposto + valorComissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nValor das vendas: " + valorVendas +
                "\nComissão: " + comissao + "%";
    }
}
