package tp3.ejercicio3;

public class Jaula {
    private Object rueda = new Object();
    private Object plato = new Object();
    private Object hamaca = new Object();

    public Jaula() {
    }

    public void usarPlato(int secs) {
        synchronized (this.plato) {
            try {
                System.out.println(Thread.currentThread().getName() + ", esta usando el plato.");
                Thread.sleep(secs * 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("--- " + Thread.currentThread().getName() + " liberó el plato. ---");

        }
    }

    public void usarHamaca(int secs) {
        synchronized (this.hamaca) {
            try {
                System.out.println(Thread.currentThread().getName() + ", esta usando la hamaca.");
                Thread.sleep(secs * 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("--- " + Thread.currentThread().getName() + " liberó la hamaca. ---");
        }
    }

    public void usarRueda(int secs) {
        synchronized (this.rueda) {
            try {
                System.out.println(Thread.currentThread().getName() + ", esta usando la hamaca.");
                Thread.sleep(secs * 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("--- " + Thread.currentThread().getName() + " liberó la rueda. ---");
        }
    }
}
