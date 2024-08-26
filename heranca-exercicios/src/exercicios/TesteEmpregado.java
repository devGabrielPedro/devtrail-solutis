package exercicios;

import java.util.ArrayList;

public class TesteEmpregado {
    public static void main(String[] args) {
        ArrayList<Empregado> empregados  = new ArrayList<>();

        empregados.add(new Empregado("Pedro Gabriel", "Quadra 2, Casa 12", "11111-1111", 1, 3000.00, 10.0));
        empregados.add(new Empregado("Ana Clara", "Quadra 3, Casa 20", "22222-2222", 2, 3500.00, 10.0));
        empregados.add(new Empregado("Lucas Guimarães", "Setor Central, Apt 145", "33333-3333", 3, 3200.00, 10.0));
        empregados.add(new Empregado("Felipe Santos", "Setor Central, Apt 101", "44444-4444", 4, 2800.00, 10.0));

        for (Empregado empregado : empregados) {
            System.out.println("Detalhes do Empregado:");
            System.out.println(empregado);
            System.out.println("Salário Líquido: " + empregado.calcularSalario());
            System.out.println();
        }
    }
}

