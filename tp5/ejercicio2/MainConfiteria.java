package tp5.ejercicio2;

public class MainConfiteria {
    private static int CANTIDAD = 5;

    public static void main(String[] args) {
        Confiteria confiteria = new Confiteria();
        Mozo mozo = new Mozo(confiteria);
        Thread h1, h2;
        Cocinero cocinero = new Cocinero(confiteria);
        Empleado[] empleados = new Empleado[CANTIDAD];
        Thread[] h = new Thread[CANTIDAD];
        h1 = new Thread(mozo);
        h2 = new Thread(cocinero);
        h1.start();
        h2.start();
        for (int i = 0; i < CANTIDAD; i++) {
            empleados[i] = new Empleado("E " + i, confiteria);
            h[i] = new Thread(empleados[i]);
            h[i].start();
        }

    }
}
