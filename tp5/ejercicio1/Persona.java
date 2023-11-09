package tp5.ejercicio1;

public class Persona implements Runnable {
    private GestorPiscina unaPiscina;

    public Persona(GestorPiscina unaPiscina) {
        this.unaPiscina = unaPiscina;
    }

    public void run() {
        while (true) {
            unaPiscina.entrar();// intenta entrar a la piscina si hay espacio
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            } // tiempo que se nado en la piscina
            unaPiscina.salir();// sale de la piscina
        }
    }
}
