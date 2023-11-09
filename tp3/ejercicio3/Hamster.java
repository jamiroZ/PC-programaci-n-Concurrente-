package tp3.ejercicio3;

public class Hamster implements Runnable {
    private String nombre;
    private Jaula jaula;

    public Hamster(String nombre, Jaula jaula) {
        this.nombre = nombre;
        this.jaula = jaula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void run() {
        for (int i = 0; i < 1; i++) {
            this.jaula.usarRueda(5);
            this.jaula.usarPlato(3);
            this.jaula.usarHamaca(10);
        }
    }
}
