package sesion0204;

public class Autobus extends Vehiculo{
    private int numeroPlazas;

    public Autobus(String matricula, String modelo, double potenciaCV, int numeroPlazas) {
        super(matricula, modelo, potenciaCV);
        this.numeroPlazas = numeroPlazas;
    }
    //constructor parametrizado


    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "numeroPlazas=" + numeroPlazas +
                '}';
    }
}
