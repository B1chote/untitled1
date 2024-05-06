package sesion0504;

public class Persona {
    protected static int contadorPersona=0;

    public Persona(){
        contadorPersona++;
    }
    void message(){
        System.out.println("soy el método de la clase Persona");
    }
    void hola(){

    }
}
