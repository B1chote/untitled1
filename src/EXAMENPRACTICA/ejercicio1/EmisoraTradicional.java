package EXAMENPRACTICA.ejercicio1;

public class EmisoraTradicional extends Emisora implements IEmitible{
    private static final double PRECIO_OYENTE=0.023;
    private Frecuencia frecuencia;
    private  double num_frecuencia;

    public EmisoraTradicional(String nombre, int anyo_creacion, int num_oyentes, double num_frecuencia) {
        super(nombre, anyo_creacion, num_oyentes);
        this.num_frecuencia = num_frecuencia;
        if(num_frecuencia>88.1 && num_frecuencia<108.1){
            this.frecuencia=Frecuencia.FM;
        } else if (num_frecuencia>= 540 && num_frecuencia<=1600){
            this.frecuencia=Frecuencia.AM;
        } else {
            System.out.println("Lanzaremos una excepción cuando sepamos");
        }
    }

    @Override
    public double ganancias() {
        double resultado=0;
        resultado=num_oyentes*PRECIO_OYENTE;
        return resultado;
    }

    public Frecuencia getFrecuencia() {
        return frecuencia;
    }

    public double getNum_frecuencia() {
        return num_frecuencia;
    }

    public void setNum_frecuencia(double num_frecuencia) {
        this.num_frecuencia = num_frecuencia;
    }

    @Override
    public void iniciarEmision() {
        System.out.println("Iniciando la emisión "+nombre+" en "+num_frecuencia);
        emitiendo=true;
    }

    @Override
    public void finalizarEmision() {
        System.out.println("Finalizando la emisión");
        emitiendo=false;
        //setEmitiendo(false);
    }
}