package sesion1403.trabajos;


public class Coches {
    private Colores color;
    private Marcas marca;
    private String matricula;
    private Damage damage;

    public Coches (String matricula, String color, String marca, String damage) {
        this.matricula=matricula;
        this.color=Colores.valueOf(color);
        this.marca=Marcas.valueOf(marca);
        this.damage=Damage.valueOf(damage);
    }

    public Colores getColor() {
        return color;
    }

    public Marcas getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public Damage getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "matricula='" + matricula + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", daño='" + damage;
    }
}
