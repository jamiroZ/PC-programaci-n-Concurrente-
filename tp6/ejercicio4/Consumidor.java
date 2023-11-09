package tp6.ejercicio4;

public class Consumidor implements Runnable {
    private Almacen almacen;

    public Consumidor(Almacen almacen) {
        this.almacen = almacen;
    }

    public void run() {
        while (true) {
            almacen.retirar();// intenta colocar producto
            try {
                Thread.sleep((long) Math.random() * 15000);// tiempo que tarda en colocar el producto
            } catch (InterruptedException ex) {
            }
            almacen.salir();// termina de colocar el producto
        }

    }
}
