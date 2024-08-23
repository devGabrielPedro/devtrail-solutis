package exercicios;

public class Gato extends AnimalTerrestreAB {

    private String corDoPelo;

    public Gato(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas, String corDoPelo) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas);
        this.corDoPelo = corDoPelo;
    }

    @Override
    public void comer(int quantidadeComida) {
        System.out.println("O gato " + nome + " de cor " + corDoPelo + " comeu " + quantidadeComida + " unidades de comida");
    }

    @Override
    public void moverse(int distancia) {
        System.out.println("O gato " + nome + " de cor " + corDoPelo + " caminhou " + distancia + " metros");
    }

    @Override
    public void dormir(int horas) {
        System.out.println("O gato " + nome + " de cor " + corDoPelo + " dormiu por " + horas + " horas");
    }
}

