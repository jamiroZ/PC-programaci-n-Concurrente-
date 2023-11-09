package tp3.ejercicio2;

public class HilosEnergeticos implements Runnable {
    private String nombre;
    private int revitaliza;
    private Energia energia;

    public HilosEnergeticos(String nombre, int revitaliza, Energia energia) {
        this.energia = energia;
        this.revitaliza = revitaliza;
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getRevitaliza() {
        return this.revitaliza;
    }

    public Energia getEnergia() {
        return this.energia;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            // System.out.println("hilo:" + nombre + ", revitaliza:" + revitaliza);
            this.energia.setEnergia(this.revitaliza);
        }
    }
}
