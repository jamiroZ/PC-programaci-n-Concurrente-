package tp6.ejercicio4;

public class Productor implements Runnable {
    private Almacen almacen;
    private String legajo;

    public Productor(Almacen almacen, String legajo) {
        this.almacen = almacen;
        this.legajo = legajo;
    }

    public void run() {
        while (true) {
            almacen.colocar(legajo);// intenta colocar producto
            try {
                Thread.sleep((long) Math.random() * 15000);// tiempo que tarda en colocar el producto
            } catch (InterruptedException ex) {
            }
            almacen.termino(legajo);// termina de colocar el producto
        }
    }
}
