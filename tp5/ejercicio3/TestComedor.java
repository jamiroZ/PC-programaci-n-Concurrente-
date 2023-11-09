package tp5.ejercicio3;

public class TestComedor {
    private static int GATO = 5;
    private static int PERRO = 5;
    private static int PLATOS = 6;

    public static void main(String[] args) {
        Perro[] perros = new Perro[PERRO];
        Gato[] gatos = new Gato[GATO];
        Comedor unComedor = new Comedor(PLATOS);// carga el comedor con la cantidad de comederos disponibles
        // cargo y arranco los hilos de perros y gatos
        for (int i = 0; i < PERRO; i++) {
            perros[i] = new Perro(unComedor);
            perros[i].start();
        }
        for (int i = 0; i < GATO; i++) {
            gatos[i] = new Gato(unComedor);
            gatos[i].start();
        }

        /*
         * for (int i = 0; i < GATO; i++) {
         * try {
         * gatos[i].join();
         * } catch (InterruptedException e) {
         * }
         * }
         * for (int i = 0; i < PERRO; i++) {
         * try {
         * perros[i].join();
         * } catch (InterruptedException e) {
         * }
         * }
         */

    }
}