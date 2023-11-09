package tp4.ejercicio1;

public class HiloC implements Runnable {
    private SynchronizedCounter c1;
    private SynchronizedObjectCounter c2;
    private int iteracion = 10;

    public HiloC(SynchronizedCounter c1, SynchronizedObjectCounter c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public void run() {
        for (int i = 0; i < iteracion; i++) {// iteraciones para synchronizedCounter
            c1.increment();
            c1.value();

            c1.decrement();
            c1.value();

            c1.increment();
            c1.value();
        }
        // espacio
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println(" ");
        for (int i = 0; i < iteracion; i++) {
            c2.increment();
            c2.value();

            c2.decrement();
            c2.value();

            c2.increment();
            c2.value();
        }
    }
}
