package sesion0404.camposocultos;

public class C extends B{
    char c1='Z';
    void verCampos(){
        System.out.println("Acceso al elemento c1 de la clase c---> "+c1);
        System.out.println("Campo c1 del padre(c1 de la clase b)--> "+super.c1);
        System.out.println("Campo c1 del abuelo(c1 de la clase a)-> "+((A)this).c1);
    }

    public static void main(String[] args) {
        C objetoC = new C();
        objetoC.verCampos();
    }
}
