package exercicios;

public class TesteAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Fred", "Cachorro", 3, "Doméstico", 0.6, 33, 4, "Bulldog");
        Gato gato = new Gato("Bella", "Gato", 4, "Doméstico", 0.3, 7, 4, "Preto");
        Elefante elefante = new Elefante("Samanta", "Elefante", 11, "Selva", 3.5, 5200, 4, "Indiano");
        Leao leao = new Leao("Mufasa", "Leão", 8, "Selva", 1.5, 200, 4, "Savana");
        Peixe peixe = new Peixe("Nemo", "Peixe", 1, "Lago", 0.1, 0.5, "Salgada");
        Pombo pombo = new Pombo("Pidgey", "Pombo", 1, "Urbano", 0.2, 0.5, 2, 0.7, "branco");

        System.out.println("--- Cachorro ---");
        cachorro.comer(2);
        cachorro.moverse(100);
        cachorro.dormir(8);

        System.out.println("--- Gato ---");
        gato.comer(1);
        gato.moverse(50);
        gato.dormir(10);

        System.out.println("--- Elefante ---");
        elefante.comer(50);
        elefante.moverse(200);
        elefante.dormir(5);

        System.out.println("--- Leão ---");
        leao.comer(20);
        leao.moverse(150);
        leao.dormir(7);

        System.out.println("--- Peixe ---");
        peixe.comer(3);
        peixe.moverse(500);
        peixe.dormir(6);

        System.out.println("--- Pombo ---");
        pombo.comer(1);
        pombo.moverse(300);
        pombo.dormir(7);
    }

}
