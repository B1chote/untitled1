package sesion0204;

public class Vehiculo {
    //atributos
    private String matricula;
    private String modelo;
    private double potenciaCV;
    //constructor parametrizado
    public Vehiculo(String matricula, String modelo, double potenciaCV) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
    }

    //getter
    public String getMatricula() {
        return matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public double getPotenciaCV() {
        return potenciaCV;
    }
    //setter
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    //tostring
    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", potenciaCV=" + potenciaCV +
                '}';
    }
}