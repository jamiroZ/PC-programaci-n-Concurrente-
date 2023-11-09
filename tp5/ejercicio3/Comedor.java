package tp5.ejercicio3;

import java.util.concurrent.Semaphore;

public class Comedor {
   private Semaphore perroSemaphore;
   private Semaphore gatoSemaphore;
   private Semaphore mutex;
   private int capacidad;

   public Comedor(int capacidad) {
      this.perroSemaphore = new Semaphore(capacidad);
      this.gatoSemaphore = new Semaphore(capacidad);
      mutex = new Semaphore(1);
      this.capacidad = capacidad;
   }

   // entran a comer
   public void perroCome() {
      try {
         mutex.acquire();
      } catch (InterruptedException e1) {
      }
      if (nohayPerros())
         try {
            gatoSemaphore.acquire(capacidad);
         } catch (InterruptedException e) {
         }
      try {
         perroSemaphore.acquire(1);
      } catch (InterruptedException e) {
      }
      System.out.println("-come perro-");
      mutex.release();

   }

   public void gatoCome() {
      try {
         mutex.acquire();
      } catch (InterruptedException e1) {
      }
      if (nohayGatos())
         try {
            perroSemaphore.acquire(capacidad);
         } catch (InterruptedException e) {
         }
      try {
         gatoSemaphore.acquire(1);
      } catch (InterruptedException e) {
      }
      System.out.println("-come gato-");
      mutex.release();

   }

   // salen despues de comer
   public void saleGato() {
      gatoSemaphore.release(1);
      if (nohayPerros())
         perroSemaphore.release(capacidad);
      System.out.println("SALE GATO; ");

   }

   public void salePerro() {
      perroSemaphore.release(1);
      if (nohayPerros())
         gatoSemaphore.release(capacidad);
      System.out.println("SALE PERRO; ");
   }

   // retornan un logico si estan comiendo en todos los platos
   public boolean nohayPerros() {
      return perroSemaphore.availablePermits() == capacidad;
   }

   public boolean nohayGatos() {
      return gatoSemaphore.availablePermits() == capacidad;
   }
}