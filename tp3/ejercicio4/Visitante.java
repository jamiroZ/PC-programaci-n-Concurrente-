package tp3.ejercicio4;

public class Visitante implements Runnable {
    private String nombre;
    private Parque unParque;

    public Visitante(String nombre, Parque unParque) {
        this.nombre = nombre;
        this.unParque = unParque;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void run() {
        int areaElegida = (int) ((Math.random() * unParque.getCantAreas()));
        unParque.reservarAreas(areaElegida);
    }
}
