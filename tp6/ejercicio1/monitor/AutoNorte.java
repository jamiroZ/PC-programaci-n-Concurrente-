package tp6.ejercicio1.monitor;

public class AutoNorte implements Runnable {
   private String patente;
   private Puente puente;

   public AutoNorte(String patente, Puente puente) {
      this.patente = patente;
      this.puente = puente;
   }

   public void run() {
      while (true) {
         puente.entrarCocheNorte(patente);
         try {
            Thread.sleep((long) Math.random() * 15000);// simula el tiempo que tarda en comer
         } catch (InterruptedException ex) {
         }
         puente.salirCocheNorte(patente);
      }
   }
}
