package EXAMENPRACTICA.ejercicio2;

public final class Programador {
    //atributos
    private String nombre;
    private String dni;
    private double salario_base;
    private int retencion ;
    private double salario_neto;
    private String lp;
    private Categoria categoria;
    //constructor por defecto
    public Programador(){
    }
    //constructor parametrizado

    public Programador(String nombre, String dni, int retencion, String lp, Categoria categoria) {
        this.nombre = nombre.toLowerCase();
        if (verificar_dni(dni.toUpperCase())==true){
           this.dni=dni.toUpperCase();
        }
        this.retencion = retencion;
        this.lp = lp.toUpperCase();
        this.categoria = categoria;
        this.salario_base = calcularSalarioBase();
        this.salario_neto = calcularSalarioNeto();

    }

    private double calcularSalarioNeto() {
        double resultado=0;
        resultado=salario_base-salario_base*(retencion/100);
        return resultado;
    }

    private double calcularSalarioBase() {
        double resultado=0;
        /*si junior 18000 si senior 27000 si jdfp 35000*/
        switch (categoria){
            case junior -> resultado=18000;
            case senior -> resultado=27000;
            case jefe_proyecto -> resultado=35000;
        }
        return resultado;
    }

    //método dni
    private boolean verificar_dni(String dni){
        boolean resultado = false;
        final int DIGITO=23;
        int numero=Integer.parseInt(dni.substring(1,8));
        int resto=numero%DIGITO;
        char letra_correcta;
        switch (resto){
            case 0: letra_correcta='T';break;
            case 1: letra_correcta='R';break;
            case 2: letra_correcta='W';break;
            case 3: letra_correcta='A';break;
            case 4: letra_correcta='G';break;
            case 5: letra_correcta='M';break;
            case 6: letra_correcta='Y';break;
            case 7: letra_correcta='F';break;
            case 8: letra_correcta='P';break;
            case 9: letra_correcta='D';break;
            case 10: letra_correcta='X';break;
            case 11: letra_correcta='B';break;
            case 12: letra_correcta='N';break;
            case 13: letra_correcta='J';break;
            case 14: letra_correcta='Z';break;
            case 15: letra_correcta='S';break;
            case 16: letra_correcta='Q';break;
            case 17: letra_correcta='V';break;
            case 18: letra_correcta='H';break;
            case 19: letra_correcta='L';break;
            case 20: letra_correcta='C';break;
            case 21: letra_correcta='K';break;
            case 22: letra_correcta='E';break;
            default:
                System.out.println("NO ES POSIBLE IDENTIFICAR");

        }
        char letra_introducida=dni.substring(dni.length()).charAt(0);
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public int getRetencion() {
        return retencion;
    }

    public double getSalario_neto() {
        return salario_neto;
    }

    public String getLp() {
        return lp;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toLowerCase();
    }

    public void setDni(String dni) {
        this.dni = dni.toUpperCase();
    }

    public void setRetencion(int retencion) {
        this.retencion = retencion;
        this.salario_neto = calcularSalarioNeto();
    }

    public void setLp(String lp) {
        this.lp = lp.toUpperCase();
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
        this.salario_base = calcularSalarioBase();
        this.salario_neto = calcularSalarioNeto();
    }
}
