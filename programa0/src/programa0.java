import java.util.Scanner;

public class programa0 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("seleccione una opcion:" );
        System.out.println("1- opcion a");
        System.out.println("2- opcion b");
        System.out.println("3- opcion c");
        System.out.println("0- salir");

        int opcion;
        do{
            opcion = teclado.nextInt();
            switch (opcion){
                case 0:{
                    System.out.println("el programa ha terinado");
                }break;
                case 1:{
                    System.out.println("opcion a seleccionada");
                }break;
                case 2:{
                    System.out.println("opcion b seleccionada");
                }break;
                case 3:{
                    System.out.println("opcion c seleccionada");
                }break;
                default:{
                    System.out.println("opcion no disponible");
                }
            }
        }while(opcion!=0);

    }
}
