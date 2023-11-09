package tp4.ejercicio3;

public class testMain {
    public static void main(String[] args) {
        Recurso rec = new Recurso();

        P1 p1 = new P1(rec);
        P2 p2 = new P2(rec);
        P3 p3 = new P3(rec);

        Thread h1 = new Thread(p1);
        Thread h2 = new Thread(p2);
        Thread h3 = new Thread(p3);

        h1.start();
        h2.start();
        h3.start();

    }
}
