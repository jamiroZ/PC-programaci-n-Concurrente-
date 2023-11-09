package tp4.ejercicio1;

public class CounterMain {
    public static void main(String[] args) {
        SynchronizedCounter c1 = new SynchronizedCounter();
        SynchronizedObjectCounter c2 = new SynchronizedObjectCounter();

        HiloC r1 = new HiloC(c1, c2);
        HiloC r2 = new HiloC(c1, c2);

        Thread h1 = new Thread(r1);
        Thread h2 = new Thread(r2);

        h1.start();
        h2.start();
    }
}
