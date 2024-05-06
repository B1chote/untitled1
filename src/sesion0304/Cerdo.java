package sesion0304;

public class Cerdo {
    private int edad;
    private String alimentacion;

    public Cerdo(int edad, String alimentacion) {
        this.edad = edad;
        this.alimentacion = alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public String toString() {
        return "Cerdo{" +
                "edad=" + edad +
                ", alimentacion='" + alimentacion + '\'' +
                '}';
    }
}

