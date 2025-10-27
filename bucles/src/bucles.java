import java.util.Scanner;
public class bucles {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        do{
            System.out.println("ingrese un numero ");
            num = teclado.nextInt();
            if ((num % 2) == 0){
                System.out.println("el numero es par");
            } else {
                System.out.println("el numero es impar");
            }if (num>=0){
                System.out.println("el numero es positivo");
            }else{
                System.out.println("el numero es negativo");
            }System.out.println( "su cuadrado es" + Math.pow(num,2));
            System.out.println("si quiere detener el programa ingrese un 0, si desea continuar ingrese un 1 ");
        }while (num!= 0);
    }
}
