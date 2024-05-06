package sesion2604;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que tipo de conjunto quieres crear?");
        System.out.println("E->enteros");
        System.out.println("S->strings");
        String seleccion = sc.next().toUpperCase();

        if (seleccion.equals("E")) {
            System.out.println("¿Cuántos elementos desea añadir?");
            int i = sc.nextInt();
            HashSet<Integer> enteros = new HashSet<>(i);
            while (i > 0) {
                System.out.println("introduzcame un valor");
                enteros.add(sc.nextInt());
                i--;
            }
            System.out.println(enteros);

        } else if (seleccion.equals("S")) {
            System.out.println("¿Cuántos elementos desea añadir?");
            int i = sc.nextInt();
            HashSet<String> string = new HashSet<>();
            while (i > 0) {
                String hashes = sc.next();
                System.out.println("introduzcame un valor");
                string.add(sc.next());
                i--;
            }
            System.out.println(string);

        } else {
            System.out.println("selección no valida");
        }

    }
}
