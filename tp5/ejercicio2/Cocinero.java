package tp5.ejercicio2;

public class Cocinero implements Runnable {
    private Confiteria unaConfiteria;

    public Cocinero(Confiteria unaConfiteria) {
        this.unaConfiteria = unaConfiteria;
    }

    public void run() {
        while (true) {
            unaConfiteria.prepararComida();
            System.out.println("-COCINERO PREPARA LA COMIDA-");
        }
    }
}
