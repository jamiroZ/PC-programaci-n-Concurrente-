package tp4.ejercicio3;

public class P3 implements Runnable {
    private Recurso rec;

    public P3(Recurso rec) {
        this.rec = rec;
    }

    public void run() {
        try {
            this.rec.getSem3().acquire();
            System.out.println("Iniciando P3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        proceso3();
        this.rec.getSem2().release();// siguiente proceso en ejecutarse
    }

    public void proceso3() {
        try {
            Thread.sleep(1000);// se detiene 1 seg
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin proceso 3");
    }
}