package tp4.ejercicio7;

import java.util.concurrent.Semaphore;

public class Confiteria {
    private Semaphore tomarAsiento;// avisa que se tomo o no asiento el empleado
    private Semaphore avisarMozo;// avisa al moso que el empleado tomo asiento y que lo atienda
    private Semaphore comidaLista;// el mozo le avisa al empleado que la comida esta lista

    public Confiteria() {// constructor
        this.tomarAsiento = new Semaphore(1);
        this.avisarMozo = new Semaphore(0);
        this.comidaLista = new Semaphore(0);
    }

    public void ocupar() throws InterruptedException {

        tomarAsiento.acquire();// el cliente intenta tomar el asiento
        System.out.println("tomo asiento el empleado: " + Thread.currentThread().getName());
        avisarMozo.release();// avisa al mozo
        comidaLista.acquire();// espera que le sirvan la comida
    }

    public void desocupar() throws InterruptedException {
        tomarAsiento.release();// el cliente se va ,libera el asiento
        System.out.println("termino de comer");
    }

    public void atender() throws InterruptedException {
        avisarMozo.acquire();// intenta agarrar el semaforo que le avisa si hay gente
        System.out.println("mozo atiende al empleado");
    }

    public void servirComida() throws InterruptedException {
        comidaLista.release();// libera el semaforo de la comida para avisarle al empleado que puede comer
        System.out.println("le sirve la comida");
    }
}
