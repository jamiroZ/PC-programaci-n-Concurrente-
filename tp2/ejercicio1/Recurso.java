package tp2.ejercicio1;

public class Recurso {
    static void uso() {
        Thread t = Thread.currentThread();
        System.out.println("en Recurso: Soy" + t.getName());
    }
}
