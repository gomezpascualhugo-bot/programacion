import java.util.Scanner;

public class contador_de_dinero {
    static void main(String[] args) {
        double comun=0.0000000111;
        double raro=0.000000016;
        double epica=0.000000022;
        double legendaria=0.000000044;
        Scanner teclaso = new Scanner(System.in);
        double cant_com;
        double cant_rar;
        double cant_epi;
        double cant_leg;

        System.out.print("ingresa la cantidad de parcelas comunes: ");
        cant_com = teclaso.nextDouble();
        System.out.print("ingresa la cantidad de parcelas raras: ");
        cant_rar = teclaso.nextDouble();
        System.out.print("ingresa la cantidad de parcelas epicas: ");
        cant_epi = teclaso.nextDouble();
        System.out.print("ingresa la cantidad de parcelas legendarias: ");
        cant_leg = teclaso.nextDouble();

        double dinero_comun = cant_com * comun;
        double dinero_raro =cant_rar*raro;
        double dinero_epico = cant_epi*epica;
        double dinero_legendario = cant_leg*legendaria;
        System.out.println("su ingreso por segundo es: " +dinero_comun+dinero_raro  +dinero_epico  +dinero_legendario    );
    }
}
