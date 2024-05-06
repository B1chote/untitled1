package sesion0904.trabajo;

import java.time.LocalDate;

public class Alumno extends Persona{

    int NIA;


    public Alumno(String DNI, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento) {
        super(DNI, nombre, apellido1, apellido2, fechaNacimiento);
    }

    public int getNIA() {
        return NIA;
    }

    public void setNIA(int NIA) {
        this.NIA = NIA;
    }
}
