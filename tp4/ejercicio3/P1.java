package tp4.ejercicio3;

public class P1 implements Runnable {
    private Recurso rec;

    public P1(Recurso rec) {
        this.rec = rec;
    }

    public Recurso getRecP1() {
        return this.rec;
    }

    public void run() {
        try {
            this.rec.getSem1().acquire();
            System.out.println("Iniciando P1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        proceso1();
        this.rec.getSem3().release();// siguiente proceso en ejecutase
    }

    public void proceso1() {
        try {
            Thread.sleep(1000);// se detiene 1 seg
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin proceso 1");
    }
}