package sesion1403.trabajos;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String[] coches = new String[5];
        Colores color = null;
        Marcas marca = null;
        Damage damage = null;
        System.out.println("Dime 5 matriculas de coches (O cualquier cosa)");
        for(int i=0;i<5;i++){
            String matricula=sc.next();
            int colVal= rnd.nextInt(11);
            switch (colVal){
                case 1: color=Colores.ROJO; break;
                case 2: color=Colores.AZUL; break;
                case 3: color=Colores.AMARILLO; break;
                case 4: color=Colores.LILA; break;
                case 5: color=Colores.MARRON; break;
                case 6: color=Colores.MORADO; break;
                case 7: color=Colores.NEGRO; break;
                case 8: color=Colores.NARANJA; break;
                case 9: color=Colores.BLANCO; break;
                case 10: color=Colores.ROSA; break;
                case 11: color=Colores.PURPURA; break;
                case 12: color=Colores.GRIS; break;
                case 13: color=Colores.VERDE; break;
            }
            int marVal= rnd.nextInt(12);
            switch (marVal){
                case 1: marca=Marcas.AUDI; break;
                case 2: marca=Marcas.TOYOTA; break;
                case 3: marca=Marcas.MERCEDES; break;
                case 4: marca=Marcas.KOENIGSEGG; break;
                case 5: marca=Marcas.LEXUS; break;
                case 6: marca=Marcas.CHEVROLET; break;
                case 7: marca=Marcas.PORCHE; break;
                case 8: marca=Marcas.BVM; break;
                case 9: marca=Marcas.SEAT; break;
                case 10: marca=Marcas.FORD; break;
            }
            int damVal= rnd.nextInt(21);
            switch (damVal){
                case 1: damage=Damage.CHOQUE; break;
                case 2: damage=Damage.SINIESTRO; break;
                case 3: damage=Damage.EMBRAGUE_DESGASTADO; break;
                case 4: damage=Damage.BATERIA_ROTA; break;
                case 5: damage=Damage.FRENOS_DESGASTADOS; break;
                case 6: damage=Damage.INYECTOR_ROTO; break;
                case 7: damage=Damage.RUEDA_PINCHADA; break;
                case 8: damage=Damage.LUNA_ROTA; break;
                case 9: damage=Damage.PERDIDA_DE_ACEITE; break;
                case 10: damage=Damage.TURBO_ROTO; break;
                default: damage=Damage.NO_DAÑOS; break;
            }
            Coches c = new Coches(matricula, color.toString(),
                    marca.toString(), damage.toString());
            coches [i]=c.toString();

        }
        System.out.println("La información de los coches es:");
        for(int i=0;i<5;i++){
            int num=i+1;
            System.out.println("Información del coche "+ num);
            System.out.println(coches[i]);
            Thread.sleep(500);
        }
    }
}
