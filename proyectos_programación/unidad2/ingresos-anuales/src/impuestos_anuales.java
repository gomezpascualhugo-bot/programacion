import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class impuestos_anuales {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dinero;

        System.out.println("escribe tu ingreso anual: ");
        dinero = teclado.nextInt();
        int tipo = 0;
        if (dinero >= 0 && dinero < 10000) {
            tipo = 1;
        } else if (dinero >= 10000 && dinero < 50000) {
            tipo = 2;
        } else {
            tipo = 3;
        }
        double impuesto = switch(tipo) {
            case 1 -> {
                yield 0.10;
            }
            case 2 -> {
                yield 0.20;
            }
            case 3 -> {
                yield 0.30;
            }
            default -> {
                System.out.println("numero no valido");
                yield -1;
            }
        };
        System.out.println( "el impuesto a pagar es " + dinero*impuesto  + "$");
        System.out.println("este es el dinero neto que queda en tu cuenta: "+ (dinero - dinero*impuesto)+  "$");
    }
}