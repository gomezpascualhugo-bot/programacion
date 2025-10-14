import java.util.Scanner;

public class transporte {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lugarDeDestino;

        System.out.println("indique la cantidad de peso de su paquete en kg:");
        int peso;
        peso = teclado.nextInt();
        int precioPeso =0;
        if(peso >=1 && peso <=5) {
            System.out.println("ingrese su lugar de destino:");
            System.out.println("1- América del Norte");
            System.out.println("2- América Central");
            System.out.println("3- América del Sur");
            System.out.println("4- Europa");
            System.out.println("5- Asia");
            lugarDeDestino = teclado.nextInt();
            switch (lugarDeDestino) {
                case 1 -> precioPeso = 24;
                case 2 -> precioPeso = 20;
                case 3 -> precioPeso = 21;
                case 4 -> precioPeso = 10;
                case 5 -> precioPeso = 18;
                default -> {
                    System.out.println("lugar de destino no encontrado");

                }
            };
            int precioTotal = peso * precioPeso;
            System.out.println("tu paquete cuesta: " + precioTotal);
        }else {
            System.out.println("peso no valido");
        }




    }
}
