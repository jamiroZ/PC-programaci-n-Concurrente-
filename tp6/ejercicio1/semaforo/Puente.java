package tp6.ejercicio1.semaforo;

import java.util.concurrent.Semaphore;

public class Puente {
    private Semaphore carril;

    public Puente(int cantidad) {
        this.carril = new Semaphore(cantidad);
    }
}