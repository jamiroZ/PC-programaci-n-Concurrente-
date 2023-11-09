package tp5.ejercicio3;

public class Perro extends Thread {
  private Comedor unComedor;

  public Perro(Comedor unComedor) {
    this.unComedor = unComedor;
  }

  public void run() {
    while (true) {
      unComedor.perroCome();
      ;// intenta comer toma el semaforo
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      } // simula el tiempo que come
      unComedor.salePerro();// termina de comer libera el semaforo
    }
  }
}