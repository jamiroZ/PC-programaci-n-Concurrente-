package tp6.hamster;

public class MainHamster {
    public static void main(String[] args) {
        Plato plato = new Plato(3);
        Rueda rueda = new Rueda();
        HamsterMonitor[] colHamsters = new HamsterMonitor[5];
        cargarHamsters(colHamsters, plato, rueda);
        arrancarHamsters(colHamsters);

    }

    public static void cargarHamsters(HamsterMonitor[] h, Plato p, Rueda r) {
        for (int i = 0; i < h.length; i++) {
            h[i] = new HamsterMonitor(p, r, "hamster numero:" + i);
        }
    }

    public static void arrancarHamsters(HamsterMonitor[] g) {
        for (int i = 0; i < g.length; i++) {
            Thread h = new Thread(g[i], "E" + i);
            h.start();
        }
    }
}
