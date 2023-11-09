package tp5.ejercicio1;

public class MainPiscina {
    private static int CANTIDAD = 5;
    private static int CAPACIDAD = 3;

    public static void main(String[] args) {
        Persona[] personas = new Persona[CANTIDAD];
        GestorPiscina unaPiscina = new GestorPiscina(CAPACIDAD);
        // cargo los arreglos y arranco los hilos
        for (int i = 0; i < CANTIDAD; i++) {
            personas[i] = new Persona(unaPiscina);
            Thread h = new Thread(personas[i], "E" + i);
            h.start();
        }
    }
}
