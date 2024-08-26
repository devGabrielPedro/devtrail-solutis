package zoologico;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo " + getNome() + " está relinchando");
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
