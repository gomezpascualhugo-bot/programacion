import java.util.Scanner;

public class cobro_telefonico {
    static void main(String[] args) {
        double duracion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("este es un programa para asber el precio de su llamada");
        System.out.println("ingrese la duracion de su llamada: ");
        duracion = teclado.nextDouble();
        double coste_parcial;
        if (duracion <= 5) {
            coste_parcial = 1;
        } else if (duracion>5 && duracion<= 8) {
            coste_parcial = 1.80;
        }else if (duracion>8 && duracion <=10){
            coste_parcial = 2.50;
        }else {
            coste_parcial = 3;
        }
        double adicion = 0;

        System.out.println("ingrese el dia de semana que es hoy: ");
        String dia;
        dia = teclado.next();
        if (dia.equals("domingo")){
            adicion = 1.03;
        }else {


            String turno;
            System.out.println("ingrese si es turno de tarde o turno de mañana");
            turno = teclado.next();
            if(turno.equals("mañana")){
                adicion = 1.15;
            } else if(turno.equals("tarde")){
                adicion = 1.10;
            }
        }
            System.out.println("el precio de su llamada es:" + coste_parcial*adicion + "$");
    }
}
