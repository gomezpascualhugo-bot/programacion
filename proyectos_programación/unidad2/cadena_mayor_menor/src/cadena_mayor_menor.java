import java.util.Scanner;

public class cadena_mayor_menor {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Escribe un numero: ");
        a=teclado.nextInt();
        System.out.println("Escribe otro numero: ");
        b=teclado.nextInt();


        if(a<b){
            System.out.println(b +" es mayor que " + a);
        } else if(a>b){
            System.out.println(a+" es mayor que "+b);
        } else{
            System.out.println("son iguales");
        }

    }
}
