import java.util.Scanner;

public class dias_de_la_semana {
    static void main(String[] args) {
        int dia;
        Scanner teclado=new Scanner(System.in);
        System.out.println("escribe un número del 1 al 7");
        dia = teclado.nextInt();
        switch (dia){
            case 1:
                System.out.println("hoy es lunes");
            break;
            case 2:
                System.out.println("hoy es martes");
                break;
            case 3:
                System.out.println("hoy es miercoles");
                break;
            case 4:
                System.out.println("hoy es jueves");
                break;
            case 5:
                System.out.println("hoy es viernes");
                break;
            case 6:
                System.out.println("hoy es sabado");
                break;
            case 7:
                System.out.println("hoy es domigo");
                break;
        }
    }
}
