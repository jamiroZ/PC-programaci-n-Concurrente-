package tp4.ejercicio8;

import java.util.concurrent.Semaphore;

public class ControladorDeProduccion {
    private Semaphore lineaNorte;// productos eléctricos llegan desde el norte
    private Semaphore lineaOeste;// productos mecanicos llegan desde el oeste

    public ControladorDeProduccion() {// constructor
        // como las 2 lineas son independientes pueden arrancar ambas o alguna o ninguna
        this.lineaNorte = new Semaphore(1);
        this.lineaOeste = new Semaphore(1);
    }

    public void llegaElectrico() {

    }

    public void salioElectrico() {

    }

    public void llegaMecanico() {

    }

    public void salioMecanico() {

    }
}
