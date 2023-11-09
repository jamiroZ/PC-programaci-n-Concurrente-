package tp3.ejercicio4;

public class ParqueMain {
    public static void main(String[] args) {
        Parque unParque = new Parque(3);
        System.out.print("Areas y disponibilidad: ");
        unParque.mostrarAreas();

        Visitante[] visitantes = {
                new Visitante("Razor", unParque), new Visitante("Io", unParque),
                new Visitante("Invoker", unParque), new Visitante("Axe", unParque),
                new Visitante("Ursa", unParque)
        };

        Thread[] hilos = new Thread[visitantes.length];
        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Thread(visitantes[i], visitantes[i].getNombre());
        }

        for (int i = 0; i < hilos.length; i++) {
            hilos[i].start();
        }

        try {
            for (int i = 0; i < hilos.length; i++) {
                hilos[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print("Areas y disponibilidad: ");
        unParque.mostrarAreas();
    }
}
