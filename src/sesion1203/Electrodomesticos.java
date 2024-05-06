package sesion1203;
public class Electrodomesticos {

    private double precioBase;
    private double precioFinal;
    private ConsumoElectronico consumoElectronico;
    private int peso;
    private String descripcion;

    //constructor

    public Electrodomesticos() {
        this.precioBase=0;
        this.precioFinal=0;
        this.consumoElectronico=ConsumoElectronico.A;
        this.peso=0;
        this.descripcion="";
    }

    public Electrodomesticos(String consumoElectronico, int peso, String descripcion) {
        this.consumoElectronico = ConsumoElectronico.valueOf(consumoElectronico.toUpperCase());
        this.peso=peso;
        this.descripcion=descripcion;
        asignarPrecioBase();
        calcularPrecioFinal();
    }

    private void calcularPrecioFinal(){
        if (peso>0 && peso <=20){
            precioFinal=precioBase+10.5;
        } else if (peso>20&& peso<=50){
            precioFinal=precioBase+50.9;
        } else if (peso>50 && peso<=80){
            precioFinal=precioBase+80.36;
        } else {
            precioFinal=precioBase+100.21;
        }
    }

    private void asignarPrecioBase(){
        switch(consumoElectronico) {
            case A:
                precioBase = 10;
                break;
            case B:
                precioBase = 20;
                break;
            case C:
                precioBase = 30;
                break;
            case D:
                precioBase = 50;
                break;
            case E:
                precioBase = 80;
                break;
            case F:
                precioBase = 100;
                break;
        }
    }
    public double getPrecioBase() {
        return precioBase;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public ConsumoElectronico getConsumoElectronico() {
        return consumoElectronico;
    }

    public int getPeso() {
        return peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setConsumoElectronico(ConsumoElectronico consumoElectronico) {
        this.consumoElectronico = consumoElectronico;
        asignarPrecioBase();
        calcularPrecioFinal();
    }

    public void setPeso(int peso) {
        this.peso = peso;
        calcularPrecioFinal();
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" +
                "precioBase=" + precioBase +
                ", precioFinal=" + precioFinal +
                ", consumoElectronico=" + consumoElectronico +
                ", peso=" + peso +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
