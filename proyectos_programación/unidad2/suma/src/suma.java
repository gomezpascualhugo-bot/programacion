import java.util.Scanner;

public class suma {
    static void main(String[] args) {
        System.out.println("programa que suma dos números");
        // Objeto que sue usa para leer los datos de teclado
        Scanner teclado = new Scanner(System.in);

        int a;
        int b;
        System.out.println("intorduzca el pimer numero:");
        a = teclado.nextInt();
        System.out.println("intorduzca el segundo numero:");
        b = teclado.nextInt();
        int suma=a+b;
        System.out.println("la suma es "+ suma);
    }
}
