package exercicios;

public class Pombo extends AnimalVoadorAB {

    private String cor;

    public Pombo(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadeAssas, double envergaduraAssa, String cor) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadeAssas, envergaduraAssa);
        this.cor = cor;
    }

    @Override
    public void comer(int quantidadeComida) {
        System.out.println("O pombo " + nome + " de cor " + cor + " comeu " + quantidadeComida + " unidades de comida");
    }

    @Override
    public void moverse(int distancia) {
        voar(distancia);
    }

    @Override
    public void dormir(int horas) {
        System.out.println("O pombo " + nome + " de cor " + cor + " dormiu por " + horas + " horas");
    }

    @Override
    public void voar(int distancia) {
        System.out.println("O pombo " + nome + " de cor " + cor + " voou " + distancia + " metros");
    }
}

