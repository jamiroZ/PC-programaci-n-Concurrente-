package tp3.ejercicio6;

public class Suma {
    private int suma = 0;

    public Suma() {
    }

    public void sumarArray() {
    }

    public synchronized void setSuma(int val) {
        this.suma += val;
    }

    public synchronized int getSuma() {
        return this.suma;
    }
}
