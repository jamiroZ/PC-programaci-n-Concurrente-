package tp4.ejercicio4;

public class Centro {
    public static Impresora[] impresoras;

    public Centro(Impresora[] imp) {
        impresoras = imp;
    }

    public static Impresora[] getImpresoras() {
        return impresoras;
    }

}