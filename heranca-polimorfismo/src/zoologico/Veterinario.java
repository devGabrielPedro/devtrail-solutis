package zoologico;

public class Veterinario {

    public static void examinar(Animal animal){
        System.out.println(animal.getNome() + " está sendo examinado");
        animal.emitirSom();
    }

}
