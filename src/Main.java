//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();

        tarea1.titulo = "Diseñar base de datos";
        tarea1.responsable = "Ana";
        tarea1.horasEstimadas = 6.5;
        tarea1.completada = false;

        tarea2.titulo = "Programar formulario de login";
        tarea2.responsable = "Luis";
        tarea2.horasEstimadas = 4;
        tarea2.completada = false;

        tarea3.titulo = "Escribir pruebas";
        tarea3.responsable = "Carla";
        tarea3.horasEstimadas = 3.5;
        tarea3.completada = false;

        System.out.println(" Estado inicial ");
        tarea1.mostrarInformacion();
        System.out.println();
        tarea2.mostrarInformacion();
        System.out.println();
        tarea3.mostrarInformacion();

        // Se completa solamente una tarea
        System.out.println("\n Se completa solo la tarea 2 ");
        tarea2.completar();

        System.out.println("\n Estado de cada tarea ");
        tarea1.mostrarEstado();
        tarea2.mostrarEstado();
        tarea3.mostrarEstado();

        System.out.println("\n Responsables ");
        tarea1.mostrarResponsable();
        tarea2.mostrarResponsable();
        tarea3.mostrarResponsable();
    }
}