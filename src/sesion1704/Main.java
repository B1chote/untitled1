package sesion1704;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            //vamos a meter todo el codigo sensible de excepciones
            final int ANYO_ACTUAL=2024;
            Scanner sc = new Scanner(System.in);
            int edad = sc.nextInt();
            int anyo=ANYO_ACTUAL-edad;
            System.out.println("Naciste en el año: "+anyo);

            int[] listado = new int[2];
            listado [0]=2;
            listado [1]=1;
            System.out.println(listado[3]);

            System.out.println("Dame el dividendo");
            int dividendo = sc.nextInt();
            System.out.println("Dame el divisor");
            int divisor = sc.nextInt();
            int resto=dividendo%divisor;
            System.out.println("el resto es "+resto);
            int num = Integer.parseInt("100");
        }
        catch (Exception e){
            System.out.println(e.getMessage());

        } finally {
            System.out.println("ha habido un error");
        }
    }
}
