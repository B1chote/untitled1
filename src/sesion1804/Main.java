package sesion1804;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        try {
            Persona persona = new Persona("Sofía", 100);
            Scanner sc = new Scanner(System.in);
            System.out.println("introduzca el nombre de una persona");
            String nombre = sc.next();
            System.out.println("introduzca la edad de una persona");
            int edad = sc.nextInt();
            Persona persona1 = new Persona(nombre, edad);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("ha habido un error");
        }
    }
}