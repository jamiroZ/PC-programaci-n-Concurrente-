package tp4.ejercicio1;

public class SynchronizedObjectCounter {
  private int c = 0;

  public void increment() {// aumenta en 1 a c
    // "this"referencia a la variable privada c
    synchronized (this) {
      c++;
      System.out.println(Thread.currentThread().getName() + "incremento contador.");
    } // Este elemento debe ser casteado a intenger
  }

  public void decrement() {// decrementa en 1 a c
    synchronized (this) {
      c--;
      System.out.println(Thread.currentThread().getName() + "decremento contador.");
    }
  }

  public int value() {
    System.out.println(Thread.currentThread().getName() + ",contador: " + c);
    return c;
  }// retorna c
}
