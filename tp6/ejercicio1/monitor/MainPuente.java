package tp6.ejercicio1.monitor;

public class MainPuente {
      public static void main(String[] args) {
            Puente puente = new Puente(3);
            AutoSur[] autoS = new AutoSur[5];
            AutoNorte[] autoN = new AutoNorte[5];
            cargarAutos(autoN, autoS, puente);
            // arrancan los hilos
            for (int i = 0; i < autoN.length; i++) {
                  Thread h = new Thread(autoN[i]);

                  h.start();
            }
            for (int j = 0; j < autoS.length; j++) {
                  Thread k = new Thread(autoS[j]);
                  k.start();
            }
      }

      public static void cargarAutos(AutoNorte[] autoN, AutoSur[] autoS, Puente puente) {// carga autos que pasan por el
                                                                                         // NORTE O SUR
            for (int i = 0; i < autoN.length; i++) {
                  autoN[i] = new AutoNorte("A3N" + i, puente);
            }
            for (int j = 0; j < autoS.length; j++) {
                  autoS[j] = new AutoSur("B2N" + j, puente);
            }
      }
}
