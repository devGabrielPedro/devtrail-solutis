package zoologico;

public class Zoologico {

    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];
    }

    public void colocarAnimalNaJaula(int i, Animal animal) {
        if (i >= 0 && i < 10) {
            jaulas[i] = animal;
        } else {
            System.out.println("Índice de jaula inválido.");
        }
    }

    public void visitarJaulas() {
        System.out.println("+------------------------------+");
        for (int i = 0; i < jaulas.length; i++) {
            System.out.println("Visitando a jaula " + (i + 1));
            if (jaulas[i] != null) {
                jaulas[i].emitirSom();
                if (jaulas[i].podeCorrer()) { // Verifica se o animal possui o comportamento de correr
                    jaulas[i].moverse();
                }
                System.out.println("+------------------------------+");
            }
        }
    }

}
