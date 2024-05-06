package sesion0304;
import sesion1203.Electrodomesticos;

import java.util.Arrays;
import java.util.Scanner;
/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean bucle=true;
        Perro p = null;
        do{
            System.out.println("¿De que animal vas a guardar los datos?\nPerro|Gato|Cerdo");
            char opcion = sc.next().toLowerCase().charAt(0);
            String eleccionanimal = sc.next();

            switch (eleccionanimal.toLowerCase()) {
                case "perro": {

                    //generar perro
                    Perro perro = new Perro (12, "perro","sr");
                    p.saySomething();
                    System.out.println(p.showInfo());

                    break;
                }
                case "gato": {

                    //generar gato

                    System.out.println("intoduce la edad del gato: ");
                    int edadg = sc.nextInt();
                    System.out.println("intoduce el color: ");
                    String color = sc.next();
                    Gato gato1 = new Gato(edadg, color);
                    break;
                }
                case "cerdo": {

                    //generar cerdo

                    System.out.println("intoduce la edad del cerdo: ");
                    int edadc = sc.nextInt();
                    System.out.println("intoduce la alimentacion: ");
                    String alimentacion = sc.next();
                    Cerdo cerdo1 = new Cerdo(edadc, alimentacion);
                    break;
                }
                default:{
                    System.out.println("animal no valido");
                    break;
                }
            }
            Animales[] listado_animales = new Animales[1];
            listado_animales[0]=p;
            //for (int i){}
            System.out.println("¿Quieres guardar otro animal?\nY/N");
            String eleccionBucle = sc.next();
            eleccionBucle.toUpperCase();

            switch (eleccionBucle.toUpperCase()) {
                case "N": {
                    bucle = false;
                    break;
                }
                default: {
                    bucle = true;
                    break;
                }
            }

        }while (bucle==true);
    }
}
*/