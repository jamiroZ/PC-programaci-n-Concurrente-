package tp4.ejercicio1;

public class SynchronizedCounter {
    private int c = 0;

    public synchronized void increment() {
        c++;
        System.out.println(Thread.currentThread().getName() + " incremento contador. ");
    }// incrementa en 1 a c

    public void decrement() {
        c--;
        System.out.println(Thread.currentThread().getName() + " decremento contador.");
    }// decrementa en 1 a c

    public synchronized int value() {
        System.out.println("contador: " + c);
        return c;
    }// retorna c
}
