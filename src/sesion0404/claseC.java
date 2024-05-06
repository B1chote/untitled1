package sesion0404;

public class claseC extends claseB{
    public claseC(){
        System.out.println("en constructor C");
    }
    public claseC(String mensaje){
        System.out.println(mensaje);
    }
    public claseC(int numero){
        super(numero);
        System.out.println(numero);
    }
}