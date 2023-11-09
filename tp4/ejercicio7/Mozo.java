package tp4.ejercicio7;

public class Mozo implements Runnable {
    private Confiteria confiteria;

    public Mozo(Confiteria confiteria) {
        this.confiteria = confiteria;
    }

    public void run() {
        int secs = (int) (Math.random() * 10) + 1;
        while (true) {

            try {
                confiteria.atender();// intanta atender al empleado
                // simula el tiempo que tardo en cocinar el mozo
                Thread.sleep(1000 * secs);
                confiteria.servirComida();// intenta servir la comida
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}