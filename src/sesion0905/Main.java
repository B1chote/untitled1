package sesion0905;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //declarar un array de tipo de dato simple
       /* ArrayList<Integer> listado_numeros= new ArrayList<Integer>();
        //ArrayList<int> listado_numeros= new ArrayList<int>;

        //añadir elementos
        listado_numeros.add(4);
        listado_numeros.add(4);
        listado_numeros.add(-200);
        listado_numeros.add(500);
        listado_numeros.add(1000);
        listado_numeros.add(4);
        listado_numeros.add(0,6000);
        //mostrar tamaño del arraylist
        System.out.println("el tamaño del arrayliust es de "+listado_numeros.size());

        // recorrer el array list
        Iterator<Integer> itr = listado_numeros.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        // ver la posición de la primera ocurrencia del numero 4

        System.out.println("la posición de la primera vez que sale el número 4 es "+listado_numeros.indexOf(4));
        System.out.println("la posición de la ultiza vez que sale el número 4 es "+listado_numeros.lastIndexOf(4));
        // ver el elemento que ocupa una posición
        System.out.println("en la posición 3 hay el siguiente elemento"+listado_numeros.get(3));

       //eliminar un elemento

        listado_numeros.remove(4);
        listado_numeros.remove("4");*/

        ArrayList<String> listado_strings = new ArrayList<String>();
        listado_strings.add("sofia");
        listado_strings.add("sofia");
        listado_strings.add("sofia");
        listado_strings.add("diego");
        listado_strings.add("jose luis");
        listado_strings.add("hector");
        listado_strings.add("iker");

        listado_strings.remove(0);
        listado_strings.remove("sofia");


                // recorrer el array list
        Iterator<String> itr = listado_strings.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
