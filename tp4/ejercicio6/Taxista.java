package tp4.ejercicio6;

public class Taxista implements Runnable {
    private Taxi unTaxi;// el taxi de el taxista

    public Taxista(Taxi unTaxi) {// constructor
        this.unTaxi = unTaxi;
    }

    public void run() {
        // intenta realizar viaje
        if (true) {
            // realiza el viaje si el taxi esta ocupado(hay pasajeros en el taxi)
            this.unTaxi.realizarViaje();//
        }
    }
}
