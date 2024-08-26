package exercicios;

import java.util.ArrayList;

public class TesteOperario {
    public static void main(String[] args) {
        ArrayList<Operario> operarios = new ArrayList<>();

        operarios.add(new Operario("José Heitor", "Setor Central, Quadra 10", "77777-7777", 7, 2300.0, 10.0, 2900.0, 5.0));
        operarios.add(new Operario("Edmilson Matias", "Setor Central, Quadra 8", "88888-8888", 7, 2300.0, 10.0, 3200.0, 5.0));
        operarios.add(new Operario("Cosme Santos", "QR 201, Conjunto D F", "99999-9999", 7, 2300.0, 10.0, 3000.0, 5.0));
        operarios.add(new Operario("Ian Nogueira", "Setor Sul, Quadra 8", "00000-0000", 7, 2300.0, 10.0, 2800.0, 5.0));

        for (Operario operario : operarios) {
            System.out.println("Detalhes do Operário:");
            System.out.println(operario);
            System.out.println("Salário do operário: " + operario.calcularSalario());
            System.out.println();
        }
    }

}
