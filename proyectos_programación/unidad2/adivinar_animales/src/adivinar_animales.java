import java.util.Scanner;
public class adivinar_animales {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Responde a las siguientes preguntas");
        System.out.println("Cuantos huevos pone tu animal?");
        int respuesta1;
        respuesta1 = teclado.nextInt();
        if (respuesta1 >= 1) {
            System.out.println("tu animal es oviparo");
            System.out.println("cuantas aletas tiene tu oviparo?");
        } else {
            if (respuesta1 <= 0) {
                System.out.println("tu animal es mamifero");
                System.out.println("a cuantas patas anda tu mamifero?");
            }
        }
        int respuesta2;
        respuesta2 = teclado.nextInt();
        if (respuesta2 <= 0 && respuesta1 >= 1) {
            System.out.println("tu animal es un pajaro");
        } else {
            if (respuesta2 >= 1 && respuesta1 >= 1) {
                System.out.println("tu animal es un pez");
            }
        }
        if (respuesta2 == 2 && respuesta1 <= 0) {
            System.out.println("tu animal es un humano");
        } else {
            if (respuesta2 >= 4 && respuesta1 <= 0) {
                System.out.println("tu animal es un Cuadrúpedo");
                System.out.println("cuantas horas estas con tu animal al dia(quitando las horas de trabajo en caso de que trabajes con animales)");
            }
        }
        int respuesta3;
        respuesta3 = teclado.nextInt();
        if (respuesta2 >= 4 && respuesta1 <= 0 && respuesta3 <= 3) {
            System.out.println("tu animal es un animal de granja");
        } else {
            if (respuesta2 >= 4 && respuesta1 <= 0 && respuesta3 >= 3) {
                System.out.println("tu animal es domestico");
            }
        }
    }
}