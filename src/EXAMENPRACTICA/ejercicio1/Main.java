package EXAMENPRACTICA.ejercicio1;

public class Main {
    public static void main(String[] args) {
        EmisoraTradicional emisoraTradicional1 = new EmisoraTradicional("Los40",2003, 6000, 93.9);
        EmisoraTradicional emisoraTradicional2 = new EmisoraTradicional("KissFM",2010, 5000, 102.7);
        EmisoraTradicional emisoraTradicional3 = new EmisoraTradicional("RNE",1899, 40000, 855);
        EmisoraONLINE emisoraONLINE1 = new EmisoraONLINE("Los40",2003,9000000,"WWW.LOS40.COM");
        EmisoraONLINE emisoraONLINE2 = new EmisoraONLINE("Dial",2003,2000000,"WWW.CADENADIAL.COM");

        emisoraONLINE1.iniciarEmision();
        emisoraONLINE2.iniciarEmision();
        emisoraTradicional1.iniciarEmision();
        emisoraTradicional2.iniciarEmision();
        emisoraTradicional3.iniciarEmision();

        emisoraTradicional1.finalizarEmision();
        emisoraONLINE1.finalizarEmision();

        Emisora[] listado_emisoras = new Emisora[5];
        listado_emisoras[0]=emisoraONLINE2;
        listado_emisoras[1]=emisoraTradicional1;
        listado_emisoras[2]=emisoraTradicional2;
        listado_emisoras[3]=emisoraTradicional3;
        listado_emisoras[4]=emisoraONLINE1;

        for(int i=0;i< listado_emisoras.length;i++){
            System.out.println("La "+listado_emisoras[i].getClass().getName()+listado_emisoras[i].getNombre()+" tiene "+listado_emisoras[i].getNum_oyentes()+" oyentes, con ganancias de "+listado_emisoras[i].getGanancias()+" euros");
        }
    }
}
