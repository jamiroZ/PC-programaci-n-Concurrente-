package tp6.hamster;

public class HamsterMonitor implements Runnable {
    private Plato comida;
    private Rueda ejercicio;
    private String miNombre;

    public HamsterMonitor(Plato laComida, Rueda elEjercicio, String nombre) {
        comida = laComida;
        ejercicio = elEjercicio;
        miNombre = nombre;
    }

    public void run() {
        while (true) {
            comida.empezarAComer(miNombre);// intenta tomar el plato y comer
            try {
                Thread.sleep((long) Math.random() * 15000);// simula el tiempo que tarda en comer
            } catch (InterruptedException ex) {
            }
            comida.terminarDeComer(miNombre);// termina avisa que termina
            ejercicio.rodar(miNombre);// rueda xd
        }
    }
}