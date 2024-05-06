package sesion0904.trabajo;
import java.time.LocalDate;


public class Trabajador extends Persona implements Profesor {

    int NRP;

    public Trabajador(String DNI, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, int NRP) {
        super(DNI, nombre, apellido1, apellido2, fechaNacimiento);
        this.NRP = NRP;
    }

    public int getNRP() {
        return NRP;
    }

    public void setNRP(int NRP) {
        this.NRP = NRP;
    }

    @Override
    public void profesor() {

    }
}
