package exercicios;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Gabriel Pedro", "Quadra 2, Casa 12", "12345-6789", 11, 3000.00, 10.0);

        System.out.println("Detalhes do Empregado:");
        System.out.println(empregado);
        System.out.println("Salário Líquido: " + empregado.calcularSalario());

    }
}

