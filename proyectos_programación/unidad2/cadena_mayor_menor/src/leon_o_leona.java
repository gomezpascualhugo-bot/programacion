import java.util.Scanner;

public class leon_o_leona {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingresa tu anno de nacimieneto: ");
        int edad;
        edad = teclado.nextInt();
        if (2025 - edad < 50 && 2025 - edad >= 0) {
            System.out.println("estas en la zona 1");
        } else {
            if (2025 - edad >= 50 && 2025 - edad < 100) {
                System.out.println("estas en la zona 2");
            } else {
                if(2025-edad >=100 && 2025- edad <=1000) {
                    System.out.println("estas en la zona 3");
                }
            }
        }
    }
}
