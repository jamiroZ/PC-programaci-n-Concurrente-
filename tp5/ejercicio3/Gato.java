package tp5.ejercicio3;

public class Gato extends Thread{
      private Comedor unComedor;
      public Gato(Comedor unComedor){
          this.unComedor=unComedor;
      }
      public void run(){
          while(true){
            unComedor.gatoCome();//intenta comer toma el semaforo
            try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}//simula el tiempo que come 
            unComedor.saleGato();//termina de comer suelta el semaforo
          }
      }

}