import java.util.Scanner;

public class valor_de_a {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a;
        a = teclado.nextInt();
        if (a < 0) {
            System.out.println(a + " es negativo");
        } else if (a > 0) {
            System.out.println(a + " es positivo");
        } else {
            System.out.println("el numero es 0");
        }

    }
}


