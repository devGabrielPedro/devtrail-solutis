package exercicios;

import java.util.ArrayList;

public class TesteVendedor {
    public static void main(String[] args) {
        ArrayList<Vendedor> vendedores = new ArrayList<>();

        vendedores.add(new Vendedor("Isaac Dutra", "Quadra 8, Setor Sul", "12121-2121", 8, 2000.0, 10.0, 12000.0, 8.0));
        vendedores.add(new Vendedor("Carlos Antônio", "Quadra 41, Setor Leste", "13131-3131", 8, 2000.0, 10.0, 10000.0, 8.0));
        vendedores.add(new Vendedor("Viviane Souza", "Quadra 33, Setor Oeste", "14141-4141", 8, 2000.0, 10.0, 11000.0, 8.0));
        vendedores.add(new Vendedor("Maria Luíza", "Quadra 6, Setor Sul", "15151-5151", 8, 2000.0, 10.0, 13000.0, 8.0));

        for (Vendedor vendedor : vendedores) {
            System.out.println("Detalhes do Vendedor:");
            System.out.println(vendedor);
            System.out.println("Salário do vendedor: " + vendedor.calcularSalario());
            System.out.println();
        }
    }
}
