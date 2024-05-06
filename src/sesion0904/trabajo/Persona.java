package sesion0904.trabajo;

import java.time.LocalDate;


public class Persona {

        private String DNI;
        private String nombre;
        private String apellido1;
        private String apellido2;
        private LocalDate fechaNacimiento;

    public Persona(String DNI, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona() {

    }
}
