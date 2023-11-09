package tp5.ejercicio1;

import java.util.concurrent.Semaphore;

public class GestorPiscina {
    private int capacidad;// capacidad fija
    private Semaphore entrada;

    public GestorPiscina(int capacidad) {
        this.capacidad = capacidad;
        this.entrada = new Semaphore(capacidad);
    }

    public void entrar() {
        try {
            entrada.acquire(1);
        } catch (InterruptedException e) {
        }
        System.out.println("-ingreso-" + Thread.currentThread().getName());

    }

    public void salir() {
        System.out.println("-SALIO-" + Thread.currentThread().getName());
        entrada.release(capacidad);
    }

    public boolean noHayEspacio() {
        return entrada.availablePermits() == capacidad;
    }

}
