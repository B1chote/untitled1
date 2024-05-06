package sesion1203;

import java.security.interfaces.ECKey;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declarar el array de electrodomesticos
        Electrodomesticos[] lista = new Electrodomesticos[3];
        //crear tres electrodomesticos a traves de los 2 constructores
        Electrodomesticos e1 = new Electrodomesticos();
        Electrodomesticos e2 = new Electrodomesticos("A",100, "Lavadora");
        //crearemos un electrodomestico con los datos que nos meta el usuario por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("introdce consumo electrodoméstico");
        String consumo=sc.next();
        System.out.println("introduce el peso del electrodoméstico");
        int peso=sc.nextInt();
        System.out.println("introduce la descripción del electrodoméstico");
        String descri= sc.next();
        Electrodomesticos e3 = new Electrodomesticos(consumo, peso, descri);

        lista[0]=e1;
        lista[1]=e2;
        lista[2]=e3;

        for(int i=0;i<lista.length;i++){

            /*System.out.println("el precio base del electrodomestico es "+lista[i].getPrecioBase());
            System.out.println("el precio final del electrodomestico es "+lista[i].getPrecioFinal());
            System.out.println("el consumo del electrodomestico es "+lista[i].getConsumoElectronico());
            System.out.println("el peso del electrodomestico es "+lista[i].getPeso());
            System.out.println("la descripción del electrodomestico es "+lista[i].getDescripcion());*/
            System.out.println(lista[i].toString());

        }
    }
}
