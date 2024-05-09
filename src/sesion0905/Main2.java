package sesion0905;



import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {

    static ArrayList<Hotel> hoteles_friendly= new ArrayList<>();
    public static void main(String[] args) {

        Hotel hotel1 = new Hotel("Palace",1900,false);
        Hotel hotel2 = new Hotel("NH",2000,true);
        Hotel hotel3 = new Hotel("Melia",2014,true);
        Hotel hotel4= null;
        //array dinámico
        ArrayList<Hotel> listado_hoteles = new ArrayList<>();

        listado_hoteles.add(hotel1);
        listado_hoteles.add(hotel2);
        listado_hoteles.add(hotel3);
        listado_hoteles.add(new Hotel("hym",2015,true));

        listado_hoteles.remove(0);
        listado_hoteles.remove(hotel3);

        //borrar la lista

           listado_hoteles.clear();

        listado_hoteles.add(hotel1);
        listado_hoteles.add(hotel2);
        listado_hoteles.add(hotel3);

        //nuevo arraylist que contendrá los hoteles que admiten mascotas

          Iterator<Hotel> itr = listado_hoteles.iterator();

        /*while (itr.hasNext()){
            if (itr.next().isPetFriendly==true){
                hoteles_friendly.add(itr.next());
            }

        }*/
        ArrayList<Hotel> hoteles_friendly= new ArrayList<>();
        hoteles_friendly= filtrar_friendly(listado_hoteles,hoteles_friendly);

        ArrayList<Hotel> hoteles_reciente= new ArrayList<>();
        hoteles_friendly = filtrar_inaugurado(listado_hoteles, hoteles_reciente);


    }

    private static ArrayList<Hotel> filtrar_friendly(ArrayList<Hotel> listadoHoteles,ArrayList<Hotel> hoteles_friendly) {

        for (int i=0;i< listadoHoteles.size();i++){
            if (listadoHoteles.get(i).isPetFriendly==true){
                hoteles_friendly.add(listadoHoteles.get(i));
            }
        }
        return hoteles_friendly;

    }
    private static ArrayList<Hotel> filtrar_inaugurado(ArrayList<Hotel> listadoHoteles,ArrayList<Hotel> hoteles_reciente) {

        for (int i=0;i< listadoHoteles.size();i++){
            if (listadoHoteles.get(i).getInaguracion()>=2000){
                hoteles_reciente.add(listadoHoteles.get(i));
            }
        }
        Iterator<Hotel> itr = hoteles_reciente.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }
        return hoteles_reciente;

    }
}
