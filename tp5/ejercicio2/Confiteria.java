package tp5.ejercicio2;

import java.util.concurrent.Semaphore;

public class Confiteria {
    private Semaphore pedirBebida;
    private Semaphore pedirComida;
    private Semaphore servirComida;
    private Semaphore servirBebida;
    private Semaphore lugarConfiteria;

    public Confiteria() {
        this.lugarConfiteria = new Semaphore(2);// hay lugar para 2 empleados
        this.pedirBebida = new Semaphore(0);
        this.pedirComida = new Semaphore(0);
        this.servirBebida = new Semaphore(0);
        this.servirComida = new Semaphore(0);
    }

    public void entrar() {
        try {
            lugarConfiteria.acquire();
        } catch (InterruptedException e) {
        }
    }

    public void salir() {
        lugarConfiteria.release();
    }

    public void pedirComida() {
        pedirComida.release();
    }

    public void pedirBebida() {
        pedirBebida.release();
    }

    public void beber() {
        try {
            pedirBebida.acquire();
        } catch (InterruptedException e) {
        }
    }

    public void comer() {
        try {
            pedirComida.acquire();
        } catch (InterruptedException e) {
        }
        pedirBebida.release();
    }

    public void prepararComida() {
        try {
            pedirBebida.acquire();
        } catch (InterruptedException e) {
        }
        pedirBebida.release();
    }

    public void prepararBebida() {
        try {
            pedirComida.acquire();
        } catch (InterruptedException e) {
        }
        pedirComida.release();
    }
}
