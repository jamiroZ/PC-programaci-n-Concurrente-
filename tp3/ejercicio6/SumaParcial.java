package tp3.ejercicio6;

public class SumaParcial implements Runnable {
  private int[] array;
  private int ini;
  private int fin;
  private Suma sumaFinal;
  private int sumaParcial;

  public SumaParcial(int[] array, int ini, int fin, Suma sumaFinal, int sumaParcial) {
    this.ini = ini;
    this.fin = fin;
    this.sumaFinal = sumaFinal;
    this.sumaParcial = sumaParcial;
    this.array = array;
  }

  public void run() {
    for (int i = ini; ini < fin; i++) {
      sumaParcial += array[i];
      sumaFinal.setSuma(sumaParcial);
    }
  }
}
