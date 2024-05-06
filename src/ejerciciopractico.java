import java.util.Arrays;

public class ejerciciopractico {
    public static void main(String[] args) {

        final int DIMENSION=6;
        //declaración del array
        int[] numeros= new int[6];

        //inicializarlo 5-10-4-2-4
        numeros[0]=5;
        numeros[1]=10;
        numeros[2]=4;
        numeros[3]=2;
        numeros[4]=4;


        //calcular el numero multiplo de 5
        int numero_total_multiplos5= calcularmultiplos5(numeros);
        System.out.println("el numero total de multiplos de 5 en este array son "+numero_total_multiplos5);

        //calcular la media aritmética
        int media_aritmetica=calculadoramedia(numeros);
    }

    public static void imprimirArray(int[] numeros) {
        System.out.println(Arrays.toString(numeros));
    }
    private static int calculadoramedia(int[] numeros) {
        int resultado=0;
        for (int i=0; i<numeros.length;i++){
            resultado=resultado+numeros[i];
            //resultado+=numeros[i]
        }
        return resultado/ numeros.length;
    }

    private static int calcularmultiplos5(int[] numeros) {
        int resultado=0;
        for (int i=0;i< numeros.length;i++){
            if (numeros[i]%5==0){

            }
        }
        return resultado;
    }
}
