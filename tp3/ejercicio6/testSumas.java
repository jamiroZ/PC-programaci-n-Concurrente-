package tp3.ejercicio6;

import java.util.Random;

public class testSumas {

    public static void main(String[] args) {
        int[] numeros = new int[50000];
        for (int i = 0; i < numeros.length; i++) {// carga arreglo con numero variados entre 0 y 10
            numeros[i] = (int) (Math.floor(Math.random() * (10 - 0 + 1) + 0));
        }
        /*
         * for (int i = 0; i < numeros.length; i++) {
         * System.out.println(numeros[i] + " ");
         * }
         */
        SumaParcial h1 = new SumaParcial(numeros, 0, 0, null, 0);
    }
}
