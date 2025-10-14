import java.util.Scanner;

public class venta_de_uva {
    static void main(String[] args) {

        int preciouva = 1;
        double dinero = 0;
        String tipo;
        String tamanio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("bienvenido a la venta de vino");
        System.out.println("seleccione si prefiere el tipo de uva 1 o el tipo de uva 2: ");
        tipo = teclado.nextLine();
        System.out.println("escoge el tamaño 1 o tamaño 2");
        tamanio = teclado.nextLine();
        int caso1 = 0;
        int caso2 = 0;
        if(tipo.equals("tipo 1")){
            caso1 = 1;
        }else if(tipo.equals("tipo 2")){
            caso1 =2;
        }
        switch (caso1){
            case 1:{
                if (tamanio.equals("tamaño 1")){
                   dinero = 0.20;
                } else if (tamanio.equals("tamaño 2")) {
                    dinero = 0.30;
                }
            }
            break;
            case 2:{
               if(tamanio.equals("tamaño 1")){
                   dinero = -0.30;
               } else if (tamanio.equals("tamaño 2")) {
                   dinero = -0.50;
               }
            }
        }
        int cantkilos;
        double coste_semitotal = preciouva+dinero;
        System.out.println("ingrese la cantidad de kilos que vaya a comprar");
        cantkilos = teclado.nextInt();
        double coste_total = coste_semitotal*cantkilos;
        System.out.println("el precio de su compra es: " + coste_total + "$");
    }
}