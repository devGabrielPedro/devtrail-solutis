package exercicios;

public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("João Paulo", "Av. Brasil, Bloco 12 lote 14 ", "66666-6666", 2000.0, 500.0);
        System.out.println(fornecedor);

        double saldo = fornecedor.obterSaldo();
        System.out.println("Saldo do Fornecedor: " + saldo);
    }

}
