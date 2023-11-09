package tp2.ejercicio4;

public class runnableEjemplo implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println(i + " " + Thread.currentThread().getName());
        System.out.println("Termina thread " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        runnableEjemplo maria = new runnableEjemplo();// creacion
        runnableEjemplo jose = new runnableEjemplo();
        new Thread(maria, "maria").start();// ejecucion
        new Thread(jose, "jose").start();
        System.out.println("termina Thread main");
    }

}
