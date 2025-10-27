import java.util.Scanner;

public class calculadora {
    static void main(String[] args) {
        String opcion;
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        System.out.println("seleccione una opcion:");
        System.out.println("->sumar");
        System.out.println("->restar");
        System.out.println("->multiplicar");
        System.out.println("->dividir");
        System.out.println("->salir");
        opcion = teclado.next();
        do {
            for (; i == 5; i = i - 5) {
                System.out.println("seleccione una opcion:");
                System.out.println("->sumar");
                System.out.println("->restar");
                System.out.println("->multiplicar");
                System.out.println("->dividir");
                System.out.println("->salir");
                opcion = teclado.next();
            }
            i++;
            double num1;
            double num2;
            switch (opcion) {
                case "sumar": {
                    System.out.println("introduce los dos numeros que quieras sumar");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    double suma = num1 + num2;
                    System.out.println("el resulatado es: " + suma);
                }
                break;
                case "restar": {
                    System.out.println("introduce los dos numeros que quieras restar");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    double resta = num1 - num2;
                    System.out.println("el resulatado es: " + resta);

                }
                break;
                case "multiplicar": {
                    System.out.println("introduce los dos numeros que quieras multiplicar");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    double multiplicacion = num1 * num2;
                    System.out.println("el resulatado es: " + multiplicacion);
                }
                break;
                case "dividir": {
                    System.out.println("introduce los dos numeros que quieras dividir");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    if (num2 != 0) {
                        double division = num1 / num2;
                        double resto = num1 % num2;
                        System.out.println("el resulatado es: " + division);
                        System.out.println("y su resto es : " + resto);
                    } else {
                        System.out.println("no se puede dividir entre cero");
                    }
                }
                case "salir": {
                    System.out.println("desea salir definitivamente del programa, escriba no para volver a seleccionar operacion");
                    opcion = teclado.next();
                }
                break;
                default: {
                    System.out.println("operacion no encontrada");
                }
            }
        } while (!opcion.equals("salir"));
    }
}