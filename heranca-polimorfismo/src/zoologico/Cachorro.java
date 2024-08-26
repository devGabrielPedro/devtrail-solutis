package zoologico;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro " + getNome() + " está latindo");
    }

    @Override
    public void moverse() {
        System.out.println(getNome() + " está correndo");
    }

    @Override
    public boolean podeCorrer() {
        return true;
    }
}
