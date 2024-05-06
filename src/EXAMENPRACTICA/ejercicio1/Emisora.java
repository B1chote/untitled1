package EXAMENPRACTICA.ejercicio1;

public abstract class Emisora {
    public int num_emisoras;
    public int identificador;
    public String nombre;
    public int anyo_creacion;
    public boolean emitiendo;
    public int num_oyentes;
    public double ganancias;

    public Emisora(String nombre, int anyo_creacion, int num_oyentes) {
        this.nombre = nombre;
        this.anyo_creacion = anyo_creacion;
        this.num_oyentes = num_oyentes;
        this.emitiendo=false;
        this.num_emisoras=num_emisoras+1;
        this.identificador=num_emisoras;
        this.ganancias=ganancias();
    }
    public abstract double ganancias();

    public int getNum_emisoras() {
        return num_emisoras;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnyo_creacion() {
        return anyo_creacion;
    }

    public boolean isEmitiendo() {
        return emitiendo;
    }

    public int getNum_oyentes() {
        return num_oyentes;
    }

    public double getGanancias() {
        return ganancias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public void setAnyo_creacion(int anyo_creacion) {
        this.anyo_creacion = anyo_creacion;
    }

    public void setEmitiendo(boolean emitiendo) {
        this.emitiendo = emitiendo;
    }

    public void setNum_oyentes(int num_oyentes) {
        this.num_oyentes = num_oyentes;
        this.ganancias=ganancias();
    }
}
