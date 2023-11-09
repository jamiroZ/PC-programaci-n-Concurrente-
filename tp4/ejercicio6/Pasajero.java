package tp4.ejercicio6;

public class Pasajero implements Runnable {
    private Taxi unTaxi;// cantidad de pasajeros que se subieron al taxi

    public Pasajero(Taxi unTaxi) {
        this.unTaxi = unTaxi;
    }

    public void run() {
        // Intentara ocupar el taxi
        this.unTaxi.ocupar();
    }
}