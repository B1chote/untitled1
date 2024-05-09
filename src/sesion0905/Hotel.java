package sesion0905;

public class Hotel {
    //atributos
    String nombre;
    int inaguracion;
    boolean isPetFriendly;

    public Hotel(String nombre, int inaguracion, boolean isPetFriendly) {
        this.nombre = nombre;
        this.inaguracion = inaguracion;
        this.isPetFriendly = isPetFriendly;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getInaguracion() {
        return inaguracion;
    }

    public void setInaguracion(int inaguracion) {
        this.inaguracion = inaguracion;
    }

    public boolean isPetFriendly() {
        return isPetFriendly;
    }

    public void setPetFriendly(boolean petFriendly) {
        isPetFriendly = petFriendly;
    }
    @Override
    public String toString() {
        return "Hotel{" +
                "nombre='" + nombre + '\'' +
                ", inaguracion=" + inaguracion +
                ", isPetFriendly=" + isPetFriendly +
                '}';
    }

}
