package tp3.ejercicio3;

public class JaulaTest {
    public static void main(String[] args) {
        Jaula jaula = new Jaula();
        Thread h1 = new Thread(new Hamster("felipe", jaula));
        Thread h2 = new Thread(new Hamster("pedro", jaula));
        Thread h3 = new Thread(new Hamster("duki", jaula));

        Thread ha1 = new Thread(h1, h1.getName());
        Thread ha2 = new Thread(h2, h2.getName());
        Thread ha3 = new Thread(h3, h3.getName());
        ha1.start();
        ha2.start();
        ha3.start();

    }
}
