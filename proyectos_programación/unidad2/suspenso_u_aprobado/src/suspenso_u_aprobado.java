import java.util.Scanner;

public class suspenso_u_aprobado {
    static void main(String[] args) {
        int nota;
        System.out.println("ingresa tu nota: ");
        Scanner teclado = new Scanner(System.in);
        nota= teclado.nextInt();
        switch (nota){

            case 0,1,2,3:
                System.out.println("tienes un muy insuficiente");
                break;
            case 4:
                System.out.println("tienes un insuficiente");
                break;
            case 5:
                System.out.println("tienes un suficiente");
                break;
            case 6:
                System.out.println("tienes un bien");
                break;
            case 7,8:
                System.out.println("tienes un notable");
                break;
            case 9,10:
                System.out.println("tienes un sobresaliente");
                break;
            default:
                System.out.println("nota no valida");
        }
    }
}