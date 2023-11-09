package tp4.ejercicio4;

public class GestorImpresora {
    public static void main(String[] args) {
        Impresora[] a = new Impresora[3];// arreglo de 3 impresoras (semaforos)
        llenarA(a);//
        Centro c = new Centro(a);// objeto centro contiene arreglo de impresoras "a"
        Cliente[] clientes = new Cliente[6];// arreglo de 6 clientes(hilos)
        llenarClientes(clientes, c);
        activarHilos(clientes);

    }

    public static void activarHilos(Cliente[] arr) {// inicia los hilos(cliente)
        // arrancan los hilos
        for (int i = 0; i < arr.length; i++) {
            arr[i].start();
        }
    }

    public static void llenarA(Impresora[] a) {// carga un arreglo de impresoras
        // carga su tipo "letra" y codigo "letra + i"
        for (int i = 0; i < a.length; i++) {
            a[i] = new Impresora('A', "A" + i);
        }
    }

    public static void llenarClientes(Cliente[] u, Centro c) {// carga un arreglo de clientes
        // carga su objeto centro a "u" cantidad de hilos(clientes)
        for (int i = 0; i < u.length; i++) {
            u[i] = new Cliente(c);
        }

    }
}
