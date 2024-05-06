package sesion2504;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEjemplo {
    public static void main(String[] args) {
        String[] nombres2 = new String[3];
        nombres2[0]="sofia";
        nombres2[1]="celia";
        nombres2[2]="pia";

        HashSet<String> nombres = new HashSet<>();
        System.out.println(nombres.size());
        nombres.add("elemento1");
        System.out.println(nombres.size());
        nombres.add("elemento2");
        nombres.add("elemento3");
        nombres.add("elemento4");
        System.out.println(nombres.size());
        nombres.remove("elemento3");
        System.out.println(nombres.size());
        //nombres.clear();
        System.out.println(nombres.size());

        /*for (int i=0;i<nombres.size();i++){
            System.out.println(nombres);
        }*/

        Iterator<String> iterator = nombres.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
