package sesion1303;

public class Main {

    public static void main(String[] args) {
         //crearnos un objeto de la clase tienda
        Tienda t1 = new Tienda("barajas",100);
        Tienda t2 = new Tienda("granvia",200);
        Tienda t3 = new Tienda("hortaleza",600);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
    }
}
