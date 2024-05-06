package EXAMENPRACTICA.ejercicio1;

public class EmisoraONLINE extends Emisora implements IEmitible{
    public static final double PRECIO_ONLINE = 0.015;
    private String url;

    public EmisoraONLINE(String nombre, int anyo_creacion, int num_oyentes, String url) {
        super(nombre, anyo_creacion, num_oyentes);
        this.url=url;
    }


     @Override
    public double ganancias() {
        return num_oyentes*PRECIO_ONLINE;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void iniciarEmision() {
        System.out.println("Iniciando emisión "+nombre+" en "+url);
        emitiendo=true;
    }

    @Override
    public void finalizarEmision() {
        System.out.println("Finalizando emisión");
        emitiendo=false;
        //setEmitiendo(false);
    }
}
