package exercicios;

public class Cachorro extends AnimalTerrestreAB {

    private String raca;

    public Cachorro(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas, String raca) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas);
        this.raca = raca;
    }

    @Override
    public void comer(int quantidadeComida) {
        System.out.println("O cachorro " + nome + " da raça " + raca + " comeu " + quantidadeComida + " unidades de comida");
    }

    @Override
    public void moverse(int distancia) {
        System.out.println("O cachorro " + nome + " da raça " + raca + " caminhou " + distancia + " metros");
    }

    @Override
    public void dormir(int horas) {
        System.out.println("O cachorro " + nome + " da raça " + raca + " dormiu por " + horas + " horas");
    }
}

