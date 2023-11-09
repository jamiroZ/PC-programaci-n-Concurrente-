package tp5.ejercicio2;

public class Empleado implements Runnable {
    private Confiteria confiteria;
    private String legajo;

    public Empleado(String legajo, Confiteria confiteria) {// constructor
        this.confiteria = confiteria;
        this.legajo = legajo;
    }

    public void run() {// arranca el Hilo
        int secs = (int) (Math.random() * 10) + 1;
        while (true) {
            confiteria.entrar();
            System.out.println("-EMPLEADO " + Thread.currentThread().getName() + " ENTRO");
            confiteria.pedirBebida();
            System.out.println(Thread.currentThread().getName() + "-PIDIO SU BEBIDA-");
            confiteria.beber();
            System.out.println(Thread.currentThread().getName() + "-BEBE SU FERNE-");
            confiteria.pedirComida();
            System.out.println(Thread.currentThread().getName() + "-PIDE SU COMIDA-");
            confiteria.comer();
            System.out.println(Thread.currentThread().getName() + "-COME -");
        }
    }
}