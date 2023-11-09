package tp5.ejercicio2;

public class Mozo implements Runnable {
    private Confiteria confiteria;

    public Mozo(Confiteria confiteria) {
        this.confiteria = confiteria;
    }

    public void run() {

        while (true) {
            confiteria.pedirBebida();// intanta atender al empleado
            System.out.println("-mozo sirve bebida");
        }
    }
}
