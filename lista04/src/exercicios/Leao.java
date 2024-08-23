package exercicios;

public class Leao extends AnimalTerrestreAB {

    private final String territorio;

    public Leao(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas, String territorio) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas);
        this.territorio = territorio;
    }

    @Override
    public void comer(int quantidadeComida) {
        System.out.println("O leão " + nome + " do território " + territorio + " comeu " + quantidadeComida + " unidades de comida");
    }

    @Override
    public void moverse(int distancia) {
        System.out.println("O leão " + nome + " do território " + territorio + " caminhou " + distancia + " metros");
    }

    @Override
    public void dormir(int horas) {
        System.out.println("O leão " + nome + " do território " + territorio + " dormiu por " + horas + " horas");
    }
}

