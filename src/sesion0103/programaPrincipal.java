package sesion0103;

import java.util.Scanner;

public class programaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca por favor su mes de nacimiento");
        int mes=sc.nextInt();
        Horoscopo signo = null;
        for(int i=1;i<4;i++) {
            switch (mes) {
                case 1:
                    signo = Horoscopo.ACUARIO;
                    System.out.println("al haber nacido en el mes de enero (" + mes + ") su signo zodiacal es " + signo.name());
                    break;

                case 2:
                    signo = Horoscopo.PISCIS;
                    System.out.println("al haber nacido en el mes febrero (" + mes + ") su signo zodiacal es " + signo.name());
                    break;

                case 3:
                    signo = Horoscopo.ARIES;
                    System.out.println("al haber nacido en el mes marzo (" + mes + ") su signo zodiacal es " + signo.name());
                    break;

                case 4:
                    signo = Horoscopo.TAURO;
                    System.out.println("al haber nacido en el mes de abril(" + mes + ") su signo zodiacal es " + signo.name());
                    break;

                case 5:
                    signo = Horoscopo.GEMINIS;
                    System.out.println("al haber nacido en el mes mayo (" + mes + ") su signo zodiacal es " + signo.name());
                    break;

                case 6:
                    signo = Horoscopo.CANCER;
                    System.out.println("al haber nacido en el mes de junio (" + mes + ") su signo zodiacal es " + signo.name());
                    break;

                case 7:
                    signo = Horoscopo.LEO;
                    System.out.println("al haber nacido en el mes de julio (" + mes + ") su signo zodiacal es " + signo.name());
                    break;

                case 8:
                    signo = Horoscopo.VIRGO;
                    System.out.println("al haber nacido en el mes de agosto (" + mes + ") su signo zodiacal es " + signo.name());
                    break;

                case 9:
                    signo = Horoscopo.LIBRA;
                    System.out.println("al haber nacido en el mes de septiembre (" + mes + ") su signo zodiacal es " + signo.name());
                    break;

                case 10:
                    signo = Horoscopo.ESCORPIO;
                    System.out.println("al haber nacido en el mes de octubre (" + mes + ") su signo zodiacal es " + signo.name());
                    break;

                case 11:
                    signo = Horoscopo.SAGITARIO;
                    System.out.println("al haber nacido en el mes de noviembre(" + mes + ") su signo zodiacal es " + signo.name());
                    break;

                case 12:
                    signo = Horoscopo.CAPRICORNIO;
                    System.out.println("al haber nacido en el mes de diciembre (" + mes + ") su signo zodiacal es " + signo.name());
                    break;

                default:
                    System.out.println("no válido");
            }
        }
    }
}
