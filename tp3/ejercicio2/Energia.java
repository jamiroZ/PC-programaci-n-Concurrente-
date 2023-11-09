package tp3.ejercicio2;

public class Energia {
    private int energia = 10;
    private Object lock = new Object();

    public Energia() {
    }

    public int getEnergia() {
        synchronized (lock) {
            return this.energia;
        }
    }

    public boolean setEnergia(int modif) {
        synchronized (lock) {
            boolean flag = modif >= 0 || this.energia >= -modif;
            if (flag) {
                this.energia = this.energia + modif;
            } else {
                this.energia = 0;
            }
            System.out.println(Thread.currentThread().getName() + ", altero la energia en :" + modif + ".");
            System.out.println("Energia actual: " + this.energia);
            return flag;
        }
    }
}
