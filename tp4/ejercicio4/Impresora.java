package tp4.ejercicio4;

import java.util.concurrent.Semaphore;

public class Impresora {
    private String codigo;
    private char tipo;
    private Semaphore mutex;
    private boolean usando;

    public Impresora(char tipo, String cod) {// constructor
        this.tipo = tipo;
        mutex = new Semaphore(1);
        codigo = cod;
        usando = false;
    }

    public boolean usar() throws InterruptedException {
        boolean exito = false;

        mutex.acquire();
        if (!usando) {
            usando = true;
            exito = true;
            System.out.println(Thread.currentThread().getName() + " esta usando impresora " + codigo);
        }
        mutex.release();

        return exito;
    }

    public void dejar() throws InterruptedException {

        mutex.acquire();
        usando = false;
        System.out.println(Thread.currentThread().getName() + " dejó impresora " + codigo);
        mutex.release();

    }

    public char getTipo() {
        return tipo;
    }

    public String getCodigo() {
        return codigo;
    }

}
