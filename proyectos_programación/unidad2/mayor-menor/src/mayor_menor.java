import java.util.Scanner;

public class mayor_menor {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;



        System.out.print("Escribe un número: ");
        num1 = teclado.nextInt();
        System.out.print("Escribe otro número distinto: ");
        num2 = teclado.nextInt();


        String resultado = (num1 < num2) ? num1+ " es menor que "+num2:num1+" es mayor que "+num2;
        System.out.println(resultado);

    }
}
