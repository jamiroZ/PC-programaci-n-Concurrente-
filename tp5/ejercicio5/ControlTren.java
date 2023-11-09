
package tp5.ejercicio5;

import java.util.concurrent.Semaphore;

public class ControlTren implements Runnable {
    private int capacidad;
    private Semaphore sentado;
    private Semaphore levantado;

    public ControlTren(int capacidad) {
        this.sentado = new Semaphore(capacidad);
        this.levantado = new Semaphore(1);
        this.capacidad = capacidad;
    }

    public void run() {

    }
}
