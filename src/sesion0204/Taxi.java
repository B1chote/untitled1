package sesion0204;

public class Taxi extends Vehiculo{
    //atributos especificos de la clase Taxi
    private String numeroLicencia;

    public Taxi(String matricula, String modelo, double potenciaCV, String numeroLicencia) {
        super(matricula, modelo, potenciaCV);
        this.numeroLicencia = numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "numeroLicencia='" + numeroLicencia + '\'' +
                '}' + super.toString();
    }
}
