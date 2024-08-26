package exercicios;

public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Isaac Dutra", "Quadra 8, Setor SUl", "11111-1111", 3, 3000.0, 10.0, 15000.0, 6.0);

        System.out.println("Detalhes do Vendedor:");
        System.out.println(vendedor);
        System.out.println("Salário do Vendedor: " + vendedor.calcularSalario());

    }
}
