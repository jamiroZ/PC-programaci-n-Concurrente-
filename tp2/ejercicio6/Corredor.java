package tp2.ejercicio6;

public class Corredor extends Thread {
    private String nombre;
    private double distancia;

    public Corredor(String nombre) {// constructor del hilo
        this.distancia = 0;
        this.nombre = nombre;
    }

    public void avanzar(double pasos) {
        distancia = distancia + pasos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public void run() {// inicia el hilo,ejecucion
        int i, av;
        System.out.println("comienza a correr ,corredor " + this.nombre + ".");
        // el corredor da 100 pasos ,entre cada paso da un descanzo
        for (i = 0; i < 100; i++) {
            av = (int) (Math.random() * 10) + 1;// da entre 1 a 10 pasos
            this.avanzar(av);// se suma a la distancia
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("corredor: " + this.nombre + ", avanzo " + av + "cm");

        }

    }

}
