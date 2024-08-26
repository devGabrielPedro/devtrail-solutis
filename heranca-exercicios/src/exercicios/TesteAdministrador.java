package exercicios;

public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Gabriel Pedro", "EQ 6/7 Bloco A", 4, 3000.0, 11.0, 700.0);

        System.out.println("Detalhes do Administrador:");
        System.out.println(administrador);
        System.out.println("Salário Líquido: " + administrador.calcularSalario());

    }

}
