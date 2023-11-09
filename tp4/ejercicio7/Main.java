package tp4.ejercicio7;

public class Main {
    public static void main(String[] args) {
        int K = 5;
        Confiteria c = new Confiteria();
        Empleados[] empleados = new Empleados[K];
        Mozo mozo = new Mozo(c);

        (new Thread(mozo)).start();// crea hilo taxista y lo arranca
        cargarEmpleados(empleados, c);
        arrancarHilos(empleados);
    }

    public static void cargarEmpleados(Empleados[] e, Confiteria c) {
        for (int i = 0; i < e.length; i++) {
            e[i] = new Empleados("101" + i, c);
        }
    }

    public static void arrancarHilos(Empleados[] e) {
        for (int i = 0; i < e.length; i++) {
            Thread h = new Thread(e[i], "E" + i);
            h.start();
        }
    }

}
