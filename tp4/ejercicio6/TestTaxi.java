package tp4.ejercicio6;

public class TestTaxi {
    public static void main(String[] args) {

        int CANTIDAD = 10;
        Taxi unTaxi = new Taxi("199");// crea y carga un taxi con su numero de taxi
        Taxista unTaxista = new Taxista(unTaxi);// crea y carga un taxi al taxista
        Pasajero[] pasajeros = new Pasajero[CANTIDAD];
        cargarPasajeros(pasajeros, unTaxi);
        (new Thread(unTaxista)).start();// crea hilo taxista y lo arranca
        iniciarBusqueda(pasajeros);
    }

    public static void cargarPasajeros(Pasajero[] pa, Taxi ta) {// carga a cada pasajero un objeto taxi
        for (int i = 0; i < pa.length; i++) {
            pa[i] = new Pasajero(ta);
        }
    }

    public static void iniciarBusqueda(Pasajero[] pa) {// arranca cada hilo "pasajero" del arreglo de pasajeros
        for (int i = 0; i < pa.length; i++) {
            Thread h = new Thread(pa[i], "P" + i);// crea los hilos
            h.start();// arrancan
        }
    }

}