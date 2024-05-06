package sesion0304;

public class Gato {

    int edad;
    String color;

    public Gato(int edad, String color) {
        this.edad = edad;
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "edad=" + edad +
                ", color='" + color + '\'' +
                '}';
    }
}
