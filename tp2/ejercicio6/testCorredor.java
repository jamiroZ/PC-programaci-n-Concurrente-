package tp2.ejercicio6;

public class testCorredor {
    public static void main(String[] args) {
        int i, cantCorredores = 5;
        Corredor[] corredores = new Corredor[cantCorredores]; // arreglo de corredores
        Thread[] hilos = new Thread[cantCorredores];// arreglo de hilos
        // crea corredores y sus respectivos hilos
        for (i = 0; i < cantCorredores; i++) {
            corredores[i] = new Corredor("#" + (i + 1));
            hilos[i] = new Thread(corredores[i]);
        }
        // inicializa cada hilo
        for (i = 0; i < cantCorredores; i++) {
            hilos[i].start();
        }
        // espera a que cada corredor termine
        for (i = 0; i < cantCorredores; i++) {
            try {
                hilos[i].join();// detiene al corredor
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // busca al corredor que recorrio mas distancia
        Corredor ganador = corredores[0];
        for (i = 1; i < cantCorredores; i++) {
            if (ganador.getDistancia() < corredores[i].getDistancia()) {
                ganador = corredores[i];
            }
        }
        System.out.println(
                "Corredor " + ganador.getNombre() + " ha ganador con " + ganador.getDistancia() + " cm recorridos.");
    }
}
