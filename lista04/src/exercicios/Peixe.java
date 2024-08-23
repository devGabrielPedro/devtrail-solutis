package exercicios;

public class Peixe extends AnimalMarinhoAB {

    private String tipoDeAgua;

    public Peixe(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, String tipoDeAgua) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void comer(int quantidadeComida) {
        System.out.println("O peixe " + nome + " de água " + tipoDeAgua + " comeu " + quantidadeComida + " unidades de comida");
    }

    @Override
    public void moverse(int distancia) {
        nadar(distancia);
    }

    @Override
    public void dormir(int horas) {
        System.out.println("O peixe " + nome + " de água " + tipoDeAgua + " dormiu por " + horas + " horas");
    }

    @Override
    public void nadar(int distancia) {
        System.out.println("O peixe " + nome + " de água " + tipoDeAgua + " nadou " + distancia + " metros");
    }
}

