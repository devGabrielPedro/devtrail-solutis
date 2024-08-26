package zoologico;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça " + getNome() + " está zumbizando");
    }

    @Override
    public void moverse() {
        System.out.println(getNome() + " está subindo na árvore");
    }

    @Override
    public boolean podeCorrer() {
        return false;
    }
}
