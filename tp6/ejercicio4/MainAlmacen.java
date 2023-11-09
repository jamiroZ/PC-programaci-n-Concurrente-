package tp6.ejercicio4;

public class MainAlmacen {
    public static void main(String[] args) {
        Productor[] productores = new Productor[3];
        Consumidor[] consumidores = new Consumidor[6];
        String[] listadoProductos = { "coca", "ferne", "yerba", "cafe", "agua", "azucar", "miel", "droga" };
        Almacen almacen = new Almacen(listadoProductos);
        cargarProductores(productores, almacen);
        cargarConsumidores(consumidores, almacen);
        for (int i = 0; i < consumidores.length; i++) {
            Thread h = new Thread(consumidores[i]);
            h.start();
        }
        for (int i = 0; i < productores.length; i++) {
            Thread h = new Thread(productores[i]);
            h.start();
        }
    }

    public static void cargarProductores(Productor[] productores, Almacen almacen) {
        for (int i = 0; i < productores.length; i++) {
            productores[i] = new Productor(almacen, "A" + i);
        }
    }

    public static void cargarConsumidores(Consumidor[] consumidores, Almacen almacen) {
        for (int i = 0; i < consumidores.length; i++) {
            consumidores[i] = new Consumidor(almacen);
        }
    }
}
