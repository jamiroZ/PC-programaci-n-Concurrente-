package tp4.ejercicio7;

public class Empleados implements Runnable {
    private Confiteria confiteria;
    private String legajo;

    public Empleados(String legajo, Confiteria confiteria) {// constructor
        this.confiteria = confiteria;
        this.legajo = legajo;
    }

    public void run() {// arranca el Hilo
        int secs = (int) (Math.random() * 10) + 1;
        while (true) {

            try {
                confiteria.ocupar();// intenta ocupar la silla
                // simula el tiempo que tardo en comer el empleado
                Thread.sleep(1000 * secs);
                confiteria.desocupar();// intanta desocupar la silla
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}