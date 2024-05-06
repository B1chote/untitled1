package sesion1804;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        if (edad<0){
            throw new IllegalArgumentException("la edad no puede ser negativa");
        }
        this.nombre = nombre;
        this.edad = edad;
    }
}
