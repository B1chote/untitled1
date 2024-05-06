import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] edades= new int [5];

        Scanner sc = new Scanner(System.in);
        int valor=0;
        for (int i=0; i<5; i++){
            System.out.println("introduceme el valor que quiere introducir en la posición "+i+" del array");
            valor=sc.nextInt();
            edades[i]=valor;
        }
        for (int i=0; i<5; i++){
            System.out.println("el valor de la posición "+i+" es "+edades[i]);
        }
        System.out.println(Arrays.toString(edades));
    }
}
