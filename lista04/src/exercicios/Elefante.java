package exercicios;

public class Elefante extends AnimalTerrestreAB {

    private final String especie;

    public Elefante(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas, String especie) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas);
        this.especie = especie;
    }

    @Override
    public void comer(int quantidadeComida) {
        System.out.println("O elefante " + nome + " da espécie " + especie + " comeu " + quantidadeComida + " unidades de comida");
    }

    @Override
    public void moverse(int distancia) {
        System.out.println("O elefante " + nome + " da espécie " + especie + " caminhou " + distancia + " metros");
    }

    @Override
    public void dormir(int horas) {
        System.out.println("O elefante " + nome + " da espécie " + especie + " dormiu por " + horas + " horas");
    }
}

