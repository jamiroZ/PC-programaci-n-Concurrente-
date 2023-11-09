package tp6.hamster;

public class Plato {
    private int cantidad;
    private int comiendo;

    public Plato(int maximo) {
        cantidad = maximo;// capacidad de hamster que pueden comer
        comiendo = 0;// los que come al momento
    }

    // metodos sincronizados de monitor
    public synchronized void empezarAComer(String nombre) {//
        try {
            while (comiendo > cantidad) {// repite si son mas de 3 hamster que quieren comer
                System.out.println(nombre + "debe esperar para comer");
                this.wait();// bloquea el hilo,esperan(espera que liberen un plato)
            }
        } catch (InterruptedException ex) {
        }
        System.out.println(nombre + " empieza a comer");
        comiendo++;// incrementa la cantidad de hamsters que comer(toman el plato)
    }

    public synchronized void terminarDeComer(String nombre) {
        System.out.println(nombre + " termino de comer");
        comiendo--;// decrementa la cantidad de hamsters que comer(dejan el plato)
        this.notify();// libera aleatoriamente los hilos que esperan(avisa que libero el plato)
    }
}
