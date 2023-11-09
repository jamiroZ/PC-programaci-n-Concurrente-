package tp4.ejercicio6;

import java.util.concurrent.Semaphore;

public class Taxi {
    private String id;//
    private Semaphore taxiLibre;// permite ocupar el taxi
    private Semaphore taxiOcupado;// avisa al taxista
    private Semaphore finDelViaje;// finaliza el viaje

    public Taxi(String id) {// constructor
        this.id = id;
        this.taxiLibre = new Semaphore(1);
        this.taxiOcupado = new Semaphore(0);
        this.finDelViaje = new Semaphore(0);
    }

    public void realizarViaje() {
        int secs = (int) (Math.random() * 10) + 1;
        try {
            // desocupa el taxi
            taxiOcupado.acquire();//
            System.out.println("Taxi: " + this.id + " ocupado,llegara al destino en " + secs + " segundos....");
            Thread.sleep(1000 * secs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // avisa que el taxi termino el viaje
        System.out.println("---Taxi " + this.id + " llego al destino----");
        this.finDelViaje.release();//
    }

    public void ocupar() {
        try {
            // intenta ocupar el taxi
            taxiLibre.acquire();// 0
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // avisa que el taxi fue ocupado por x hilo "persona"
        System.out.println("----" + Thread.currentThread().getName() + ", ah ocupado el taxi " + this.id + "----");
        this.taxiOcupado.release();// 1
        try {
            //
            finDelViaje.acquire();// 0
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        taxiLibre.release();// 1
    }
}
