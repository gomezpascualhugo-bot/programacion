import java.util.Scanner;
public class tres_numeros_enteros {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("escribe un numero: ");
        num1 = teclado.nextInt();
        System.out.println("escribe otro numero: ");
        num2 = teclado.nextInt();
        System.out.println("escribe un numero mas: ");
        num3 = teclado.nextInt();
        if(num1>num2 && num1>num3 && num2>num3){
            System.out.println(num1+ " > " + num2 + " > " +num3);
        } else if(num2>num1 && num2>num3 && num1>num3){
            System.out.println(num2+ " > " + num1 + " > " +num3);
        } else if(num3>num1 && num3>num2 && num2>num1){
            System.out.println(num3+ " > " + num2 + " > " +num1);
        } else{
            System.out.println(num1+ " > " + num3 + " > " +num2);
        }
    }
}