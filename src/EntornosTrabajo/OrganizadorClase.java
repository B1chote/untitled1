import java.util.*;

class Alumno {
    private String nombre;
    private int id;
    private String curso;
    private String clase;

    public Alumno(String nombre, int id, String curso, String clase) {
        this.nombre = nombre;
        this.id = id;
        this.curso = curso;
        this.clase = clase;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
}

class Clase {
    private String nombreTutor;
    private String planta;
    private String curso;
    private List<Alumno> alumnos;

    public Clase(String nombreTutor, String planta, String curso) {
        this.nombreTutor = nombreTutor;
        this.planta = planta;
        this.curso = curso;
        this.alumnos = new ArrayList<>();
    }

    // Getters y setters
    public String getNombreTutor() {
        return nombreTutor;
    }

    public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    // Métodos para añadir, eliminar y modificar alumnos
    public void añadirAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void eliminarAlumno(int id) {
        for (Iterator<Alumno> iterator = alumnos.iterator(); iterator.hasNext();) {
            Alumno alumno = iterator.next();
            if (alumno.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }

    public void modificarAlumno(int id, Alumno nuevoAlumno) {
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getId() == id) {
                alumnos.set(i, nuevoAlumno);
                break;
            }
        }
    }
}

public class OrganizadorClase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos de la clase al usuario
        System.out.println("Ingrese el nombre del tutor:");
        String nombreTutor = scanner.nextLine();

        System.out.println("Ingrese la planta de la clase:");
        String planta = scanner.nextLine();

        System.out.println("Ingrese el curso:");
        String curso = scanner.nextLine();

        // Crear la clase con los datos proporcionados
        Clase clase = new Clase(nombreTutor, planta, curso);

        // Solicitar datos de los alumnos al usuario
        while (true) {
            System.out.println("\n¿Desea añadir un alumno? (s/n):");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("s")) {
                System.out.println("Ingrese el nombre del alumno:");
                String nombreAlumno = scanner.nextLine();

                System.out.println("Ingrese el ID del alumno:");
                int idAlumno = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea pendiente

                System.out.println("Ingrese el curso del alumno:");
                String cursoAlumno = scanner.nextLine();

                System.out.println("Ingrese la clase del alumno:");
                String claseAlumno = scanner.nextLine();

                // Crear el objeto Alumno con los datos proporcionados y añadirlo a la clase
                Alumno alumno = new Alumno(nombreAlumno, idAlumno, cursoAlumno, claseAlumno);
                clase.añadirAlumno(alumno);
            } else {
                break;
            }
        }

        scanner.close();

        // Mostrar la lista de alumnos en la clase
        System.out.println("\nAlumnos en la clase:");
        for (Alumno alumno : clase.getAlumnos()) {
            System.out.println("Nombre: " + alumno.getNombre() + ", ID: " + alumno.getId() +
                    ", Curso: " + alumno.getCurso() + ", Clase: " + alumno.getClase());
        }
    }
}
