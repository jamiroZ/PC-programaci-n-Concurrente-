package tp6.ejercicio2;

public class Estudiante implements Runnable {
    private SalaDeEstudio sala;
    private String legajo;

    public Estudiante(String legajo, SalaDeEstudio sala) {
        this.sala = sala;
        this.legajo = legajo;
    }

    public void run() {
        while (true) {
            sala.ingresaEstudiante(legajo);// intenta ingresar a la sala y tomar asiento
            try {
                Thread.sleep((long) Math.random() * 15000);// simula el tiempo que estudia
            } catch (InterruptedException ex) {
            }
            sala.saleEstudiante(legajo);// deja la mesa y sale de la sala
        }
    }
}
