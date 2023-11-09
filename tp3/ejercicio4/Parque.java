package tp3.ejercicio4;

public class Parque {
    private int[] areas;

    public Parque(int cantAreas) {
        this.areas = new int[cantAreas];
        this.cargarAreas();
    }

    public int getCantAreas() {
        return areas.length;
    }

    public void cargarAreas() {// Da numero aleatoreo entre 1 y 5 para cada area del parque
        for (int i = 0; i < this.areas.length; i++) {
            this.areas[i] = (int) ((Math.random() * 3) + 1);
        }
    }

    public synchronized void mostrarAreas() {
        for (int i = 0; i < this.areas.length; i++) {
            System.out.print("| " + this.areas[i] + " |");
        }
        System.out.println(" ");
    }

    public synchronized void reservarAreas(int area) {
        if (area < this.areas.length) {
            System.out.println(Thread.currentThread().getName() + ", desea reservar el area :" + area);
            if (verificarAreaLibre(area)) {
                try {
                    Thread.sleep(1500);
                    this.ocuparArea(area);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("--- Area " + area + " reservada por " + Thread.currentThread().getName() + "---");
            } else {
                System.out.println("--- El area " + area + " está totalmente ocupada ---");
            }
        }
    }

    // carga el arreglo areas con el area
    public synchronized void ocuparArea(int area) {
        this.areas[area] = this.areas[area] - 1;
    }

    // verifica que el area existe y tiene un valor
    public synchronized boolean verificarAreaLibre(int area) {
        return this.areas[area] > 0;
    }
}
