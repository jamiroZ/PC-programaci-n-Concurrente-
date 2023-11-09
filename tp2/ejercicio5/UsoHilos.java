package tp2.ejercicio5;

public class UsoHilos {
    public static void main(String[] args) {
        System.out.println("Hilo principal iniciando.");
        // Primero, construye un objeto unHilo.
        MiHilo mh = new MiHilo("#1");
        MiHilo mh2 = new MiHilo("#2");
        // Luego, construye un hilo de ese objeto.
        Thread nuevoHilo = new Thread(mh);
        Thread viejoHilo = new Thread(mh2);
        // Finalmente, comienza la ejecución del hilo.
        nuevoHilo.start();
        for (int i = 0; i < 50; i++) {
            System.out.print(" .");
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException exc) {
            System.out.println("Hilo principal interrumpido.");
        }
        viejoHilo.start();
        // viejoHilo.stop();
        for (int j = 0; j < 40; j++) {
            System.out.println(" .");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exc) {
            System.out.println("hilo secundario interrumpido.");
        }
        System.out.println("Hilo principal finalizado.");
    }
}