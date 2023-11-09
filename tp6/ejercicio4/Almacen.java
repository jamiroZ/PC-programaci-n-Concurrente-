package tp6.ejercicio4;

import java.util.Random;

public class Almacen {
    private String[] estanteria;// maximo de productos que hay en la estanteria y que estan en el momento
    private String[] listadoProductos = { "coca", "ferne", "yerba", "cafe", "agua", "azucar", "miel", "droga" };
    private Random r = new Random();// da posicion random del arreglo para llenar la estanteria
    private boolean productor;
    private boolean consumidor;

    public Almacen(String[] estanteria) {
        this.estanteria = new String[estanteria.length];
        for (int i = 0; i < estanteria.length; i++) {
            this.estanteria[i] = estanteria[i];
        }
        this.consumidor = false;
        this.productor = false;
    }

    public synchronized void retirar() {
        int e = buscarProducto();
        try {
            while (consumidor == true) {
                System.out.println("espera para comprar");
                this.wait();
            }
        } catch (InterruptedException ex) {
        }
        System.out.println("saca producto " + estanteria[e]);
        estanteria[e] = " ";
        consumidor = true;
    }

    public synchronized void salir() {
        System.out.println("se va del almacen");
        consumidor = false;
        this.notify();
    }

    public int buscarProducto() {
        int x = r.nextInt(estanteria.length);
        while (estanteria[x] == " ") {// sigue buscando si no hay producto en x posicion del arreglo
            x = r.nextInt(estanteria.length);// busca producto aleatoreamente
        }
        return x;
    }

    // productor
    public synchronized void colocar(String legajo) {
        int e = revisarEstanteria();// retorna true si hay espacio para poner productos
        try {
            while (e == this.estanteria.length + 1 || productor) {// si no hay falta de productos o hay otro productor
                // esperara
                System.out.println(legajo + " : espera");
                this.wait();// duerme el hilo productor
            }
        } catch (InterruptedException ex) {
        }
        this.estanteria[e] = listadoProductos[r.nextInt(listadoProductos.length)];// llena el estante
        productor = true;// ingreso productor
    }

    public synchronized void termino(String legajo) {
        System.out.println(legajo + " : termino de colocar producto");
        productor = false;// no hay productor en el almacen
        this.notify();// notifica que se va
    }

    public int revisarEstanteria() {
        int x = this.estanteria.length + 1;// esta por fuera del arreglo
        for (int i = 0; i < this.estanteria.length; i++) {
            if (this.estanteria[i] == " ") {// si hay espacio en la estanteria retorna true
                x = i;// asigna posicion
            }
        }
        return x;// retorna espacio de la estanteria si esta vacio si no retorna numero mayor al
                 // arreglo
    }
}
