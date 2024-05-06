package sesion0204;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //generar 1 taxi forzando los datos en el propio contructor
        Taxi taxi1 = new Taxi("1234LCB", "prius",152,"123456789PqX");

        //generar 1 taxi solicitando los datos por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("intoduceme la matricula");
        String matri=sc.next();
        System.out.println("intoduceme el modelo");
        String model=sc.next();
        System.out.println("intoduceme la potencia");
        Double pontenc=sc.nextDouble();
        System.out.println("intoduceme la licencia");
        String licencia=sc.next();

        Taxi taxi2 = new Taxi(matri, model, pontenc, licencia);

        //generar 1 autobus forzando los datos en el propio constructor
        Autobus autobus1 = new Autobus("1234LCB", "iveco",520,123);

        //generar 1 autobus solicitando los datos por teclado¡

        System.out.println("intoduceme la matricula");
        String matri1=sc.next();
        System.out.println("intoduceme el modelo");
        String model1=sc.next();
        System.out.println("intoduceme la potencia");
        double pontenc1=sc.nextDouble();
        System.out.println("intoduceme el numero de plazas");
        int plazas=sc.nextInt();

        Autobus autobus2 = new Autobus(matri1, model1, pontenc1, plazas);


        //array 2 dimensiones para taxis

        Taxi[] array_taxis = new Taxi[2];
        array_taxis [0]=taxi1;
        array_taxis [1]=taxi2;
        System.out.println(Arrays.toString(array_taxis));
        System.out.println(array_taxis.toString());

        //array 2 dimensiones para autobuses

        Autobus[] array_autobuses = new Autobus[2];
        array_autobuses [0]=autobus1;
        array_autobuses [1]=autobus2;
        System.out.println(Arrays.toString(array_autobuses));
        System.out.println(array_autobuses.toString());

        //array vehículos (2 taxis y 2 buses)

        Vehiculo[] array_vehiculos = new Vehiculo[4];
        array_vehiculos[0]=taxi1;
        array_vehiculos[1]=taxi2;
        array_vehiculos[2]=autobus1;
        array_vehiculos[3]=autobus2;

        System.out.println(Arrays.toString(array_vehiculos));
    }
}
