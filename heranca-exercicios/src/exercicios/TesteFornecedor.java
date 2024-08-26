package exercicios;

public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Gabriel Pedro", "EQ 6/7 Bloco A - Gama Leste", "11111-1111", 2000.0, 500.0);
        System.out.println(fornecedor);

        double saldo = fornecedor.obterSaldo();
        System.out.println("Saldo do Fornecedor: R$ " + saldo);
    }

}
