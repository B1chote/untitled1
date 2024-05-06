package sesion2003;

import java.util.Arrays;

public class Concesionario {
    String dirección_local;
    String[] listado_mecanicos = new String[3];
    int codigo;

    public Concesionario () {

    }
    public Concesionario (String dirección_local, String[] listado_mecanicos, int codigo){
        this.dirección_local=dirección_local;
        this.listado_mecanicos=listado_mecanicos;
        this.codigo=codigo;
    }

    public String getDirección_local() {
        return dirección_local;
    }

    public String[] getListado_mecanicos() {
        return listado_mecanicos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setDirección_local(String dirección_local) {
        this.dirección_local = dirección_local;
    }

    public void setListado_mecanicos(String[] listado_mecanicos) {
        this.listado_mecanicos = listado_mecanicos;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Concesionario{" +
                "dirección_local='" + dirección_local + '\'' +
                ", listado_mecanicos=" + Arrays.toString(listado_mecanicos) +
                ", codigo=" + codigo +
                '}';
    }
}