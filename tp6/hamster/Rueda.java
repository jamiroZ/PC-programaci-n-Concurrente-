package tp6.hamster;

public class Rueda {
    public synchronized void rodar(String nombre) {// es un metodo sincronizado pues solo lo usa 1 hamster a la ves
        System.out.println(nombre + " empieza a rodar");
        try {
            Thread.sleep((long) Math.random() * 1500);// simula tiempo en la rueda
        } catch (InterruptedException ex) {
        }
    }
}
