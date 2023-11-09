package tp2.ejercicio3;

import tp2.ejercicio4.runnableEjemplo;

public class ThreadEjemplo extends Thread {
    public ThreadEjemplo(String str) {// constructor del hilo
        super(str);
    }

    public void run() {// corre el hilo
        for (int i = 0; i < 10; i++)// repite 10 veces
            System.out.println(i + " " + getName());
        System.out.println("Termina thread " + getName());
    }

    public static void main(String[] args) {
        new ThreadEjemplo("Maria Jose").start();// crea hilo y lo inicializa
        new ThreadEjemplo("Jose Maria").start();
        System.out.println("Termina thread main");
    }
}
