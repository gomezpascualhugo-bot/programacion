import java.util.Scanner;

public class impar_par {
    static void main(String[] args) {
        System.out.println("hola, pon un número: ");
        Scanner teclado=new Scanner(System.in);
        int num1;

         num1=teclado.nextInt();

         if ((num1 % 2) == 0){
             System.out.println("el numero es par");

         }
        if ((num1 % 2) == 1){
            System.out.println("el numero es impar");

        }
         int i=0;

        for (i= 0;i<=1000;i=i+2) {
            System.out.println(i);
        }
    }
}
