import java.util.Scanner;
public class ejercicioString1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca la dimensión del array");
        int dimension=sc.nextInt();
        String[] listado = null;
        listado = new String[dimension];
        listado[0]="";

        if (listado[0].isEmpty()){
            for(int i=0;i<listado.length;i++){
                System.out.println("Introduce los datos del array");
                listado[i]=sc.next();
            }
        }
        System.out.println("Por favor dígame la posición de la que quiere usted saber el contenido de la misma");
        int posicion=sc.nextInt();
        if (posicion < listado.length){
            System.out.println(listado[posicion]);
        }
        System.out.println("Introduzca por favor el indice inferior y superior ");
        int indice_inferior=sc.nextInt();
        int indice_superior=sc.nextInt();
        System.out.println(listado[posicion].substring(indice_inferior, indice_superior));

        System.out.println("Dime qué palabra quieres busca en el array");
        String palabra_a_buscar=sc.next();
        boolean encontrado=false;
        for (int i=0;i<listado.length;i++){
            if (listado[i].equals(palabra_a_buscar)){
                System.out.println("La palabra "+palabra_a_buscar+" ha sido encontrada en la posición "+i);
                encontrado=true;
            }
            if (!encontrado){
                System.out.println("La palabra no ha sido encontrada");
            }
        }
    }
}
