package sesion0404;

public class claseB extends claseA{
    public claseB(){
        System.out.println("en constructor B");
    }
    public claseB(String mensaje){
        System.out.println(mensaje);
    }
    public claseB(int numero){
        super(numero);
        System.out.println(numero);
    }
}
