import java.util.Scanner;

public class ejercicioString {
    public static void main(String[] args) {
        String num_cuenta1="";
        String num_cuenta2="";
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca primera cuenta");
        num_cuenta1=sc.next();
        System.out.println("introduzca segunda cuenta");
        num_cuenta2=sc.next();
        System.out.println("el primer dígito de la primera cuenta es "+num_cuenta1.charAt(0));
        System.out.println("el último dígito de la primera cuenta es "+num_cuenta1.charAt(num_cuenta1.length()-1));
    }
}
