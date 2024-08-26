package zoologico;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Fred", 2);
        Animal cavalo = new Cavalo("Joe", 5);
        Animal preguica = new Preguica("Zoom", 3);

        Veterinario veterinario = new Veterinario();

        Animal[] animais = {cachorro, cavalo, preguica};

        for (Animal animal : animais) {
            Veterinario.examinar(animal);
            System.out.println();
        }

        Zoologico zoo = new Zoologico();

        zoo.colocarAnimalNaJaula(0, new Cachorro("Fred", 3));
        zoo.colocarAnimalNaJaula(1, new Cachorro("Robin", 2));
        zoo.colocarAnimalNaJaula(2, new Cachorro("Bella", 7));
        zoo.colocarAnimalNaJaula(3, new Cachorro("Flor", 5));
        zoo.colocarAnimalNaJaula(4, new Cavalo("Joe", 5));
        zoo.colocarAnimalNaJaula(5, new Cavalo("Jade", 5));
        zoo.colocarAnimalNaJaula(6, new Cavalo("Illumi", 5));
        zoo.colocarAnimalNaJaula(7, new Preguica("Zoom", 2));
        zoo.colocarAnimalNaJaula(8, new Preguica("Flash", 2));
        zoo.colocarAnimalNaJaula(9, new Preguica("Lazy", 3));

        zoo.visitarJaulas();
    }
}
