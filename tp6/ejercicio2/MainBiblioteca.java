package tp6.ejercicio2;

public class MainBiblioteca {
    public static void main(String[] args) {
        SalaDeEstudio sala = new SalaDeEstudio(3);
        Estudiante[] estudiantes = new Estudiante[5];
        cargaEstudiante(estudiantes, sala);
        iniciarHilos(estudiantes);
    }

    public static void cargaEstudiante(Estudiante[] es, SalaDeEstudio sala) {
        for (int i = 0; i < es.length; i++) {
            es[i] = new Estudiante("FAI-" + i, sala);
        }
    }

    public static void iniciarHilos(Estudiante[] es) {
        for (int i = 0; i < es.length; i++) {
            Thread h = new Thread(es[i]);
            h.start();
        }
    }
}
