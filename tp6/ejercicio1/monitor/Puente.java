package tp6.ejercicio1.monitor;

public class Puente {
    private int capacidad;// indica la capacidad del carril
    private int transitoNorte;// intica la cantidad de autos en el carril
    private int transitoSur;
    public Puente(int max) {
        this.capacidad = max;
        this.transitoNorte = 0;
        this.transitoSur=0;
    }

    public synchronized void entrarCocheNorte(String patente) {
        try {
            while (transitoNorte>capacidad && transitoSur!=0) {// entran autos del norte al carril del puente si hay espacio
                System.out.println(patente+" espera que se libere el carril");
                this.wait();// pausa el hilo
            }
        } catch (InterruptedException e) {}
        System.out.println(patente+" entro al carril del puente desde el NORTE");
        transitoNorte++;// hay mas autos en el carril
    }

    public synchronized void salirCocheNorte(String patente) {
        System.out.println("auto: "+patente+"-salio del puente");//
        transitoNorte--;//salen del puente
        this.notify();//notifica que salio del puente
    }

    public synchronized void entrarCocheSur(String patente) {
         try{
            while(transitoSur>capacidad && transitoNorte!=0){
               System.out.println(patente+" espera que se libere el carril");
               this.wait();
            }
         }catch(InterruptedException e){}
         System.out.println(patente+"entro al carril del puente desde el SUR");
         transitoSur++;
    }

    public synchronized void salirCocheSur(String patente) {
        System.out.println("auto: "+patente+"-salio del puente");//
        transitoSur--;//salen del puente
        this.notify();//notifica que salio del puente
    }
}
