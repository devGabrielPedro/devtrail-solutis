package exercicios;

public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario("José", "Setor Central, Quadra 10", "98765-4321", 2, 2500.0, 13.0, 2900.0, 5.0);

        System.out.println("Detalhes do Operário:");
        System.out.println(operario);
        System.out.println("Salário do Operário: " + operario.calcularSalario());
    }

}
