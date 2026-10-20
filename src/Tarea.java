public class Tarea {


    public String titulo;
    public String responsable;


    double horasEstimadas;
    boolean completada;


    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Responsable: " + responsable);
        System.out.println("Horas estimadas: " + horasEstimadas);
        System.out.println("Completada: " + completada);
    }

    public void completar() {
        completada = true;
        System.out.println("La tarea \"" + titulo + "\" fue completada");
    }


    void mostrarResponsable() {
        System.out.println("Responsable de \"" + titulo + "\": " + responsable);
    }

    void mostrarEstado() {
        if (completada) {
            System.out.println("La tarea \"" + titulo + "\" está completada");
        } else {
            System.out.println("La tarea \"" + titulo + "\" está pendiente");
        }
    }
}
