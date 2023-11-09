package tp4.ejercicio3;

public class P2 implements Runnable {
    private Recurso rec;

    public P2(Recurso rec) {
        this.rec = rec;
    }

    public void run() {
        try {
            this.rec.getSem2().acquire();
            System.out.println("Iniciando P2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        proceso2();
        this.rec.getSem1().release();// siguiente "Proceso" en ejecutarse
    }

    public void proceso2() {
        try {
            Thread.sleep(1000);// se detiene 1 seg
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin proceso 2");
    }
}