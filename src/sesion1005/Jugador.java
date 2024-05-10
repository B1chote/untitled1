package sesion1005;

public class Jugador extends seleccionado{
    private boolean lesionado;
    private Posición posi;

    public Jugador(int id, String nombre, String apellidos, int edad, int anyo_experiencia, int salario) throws AccionIncorrecta {
        super(id, nombre, apellidos, edad, anyo_experiencia, salario);
        this.lesionado=false;
    }

    @Override
    public double calcular_salario() {
        return 0;
    }
}
