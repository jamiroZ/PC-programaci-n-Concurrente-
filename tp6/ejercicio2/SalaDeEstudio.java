package tp6.ejercicio2;

public class SalaDeEstudio {
    private int mesasMax;
    private int mesasOcupadas;

    public SalaDeEstudio(int mesasMax) {
        this.mesasMax = mesasMax;
        this.mesasOcupadas = 0;
    }

    public synchronized void ingresaEstudiante(String legajo) {
        try {
            while (mesasMax < mesasOcupadas) {
                System.out.println("legajo: " + legajo + " espera a que se libere una mesa ");
                this.wait();// espera que le avisen que tenga espacio(pausa el hilo)
            }
        } catch (InterruptedException ex) {
        }
        System.out.println("legajo: " + legajo + " tomo la mesa");
        mesasOcupadas++;// ocupa la mesa
    }

    public synchronized void saleEstudiante(String legajo) {
        System.out.println("legajo: " + legajo + " dejo la mesa");
        mesasOcupadas--;// deja la mesa
        this.notify();// avisa que deja la mesa
    }
}
