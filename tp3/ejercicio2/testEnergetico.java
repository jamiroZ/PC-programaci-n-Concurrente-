package tp3.ejercicio2;

public class testEnergetico {
    public static void main(String[] args) {
        Energia energia = new Energia();// crea y inicializa un objeto de la Clase energia
        // crea 2 objetos hilos y define los metodos de run
        Thread h1 = new Thread(new HilosEnergeticos("La Criatura Oscura", -3, energia));
        Thread h2 = new Thread(new HilosEnergeticos("El senador", 3, energia));
        // activo hilos
        h1.start();
        h2.start();
        try {
            h1.join();
            h2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("energia final:" + energia.getEnergia());
    }
}
