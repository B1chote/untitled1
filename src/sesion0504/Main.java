package sesion0504;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.message();
        System.out.println(estudiante.contadorEstudiante);
        System.out.println(Persona.contadorPersona);
    }
}
