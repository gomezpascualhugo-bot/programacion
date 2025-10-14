import java.util.Random;
import java.util.Scanner;

public class cajero_automatico {
    static void main(String[] args) {
        int bucle=0;
        while (bucle >=0) {

            System.out.println("ingresa la contraseña: ");
            Scanner teclado = new Scanner(System.in);
            String contrasenia;
            contrasenia = teclado.next();

            if (contrasenia.equals("hola1234")) {
                bucle = -1;
                int saldo = new Random().nextInt(10000 + 1);
                System.out.println("tu dinero es este: " + saldo + "$");
                int caso = 0;
                System.out.println("ingrese su accion deseada: 1-retirar dinero; 2-verificar saldo; 3-depositar dinero");
                caso = teclado.nextInt();

                switch (caso) {
                    case 1: {

                        int dinero_retirado;
                        System.out.println("su accion indicada ha sido retirar saldo");
                        System.out.println("introduzca el dinero que quiera retirar: ");
                        dinero_retirado = teclado.nextInt();

                        if (dinero_retirado > saldo) {
                            System.out.println("la operacion no se puede llevar a cabo");
                        } else if (dinero_retirado >= 5000) {
                            System.out.println("el dinero solicitado para retirar es mayor que el limite de retirada diario");
                        } else {
                            int dinero_despuesde_retirada = saldo - dinero_retirado;
                            System.out.println("el dinero total de su cuenta es: " + dinero_despuesde_retirada + "$");

                        }
                        break;
                    }
                    case 2: {
                        System.out.println("su accion indicada ha sido verificar saldo");
                        System.out.println("su saldo es: " + saldo + "$");
                        break;
                    }
                    case 3: {
                        System.out.println("su accion indicada ha sido depositar dinero");
                        int dinero_a_ingresar;
                        System.out.print("ingrese la cantidad de dinero que quiera depositar: ");
                        dinero_a_ingresar = teclado.nextInt();
                        int saldo_final = saldo + dinero_a_ingresar;
                        System.out.println("ahora su saldo es: " + saldo_final + "$");
                        break;
                    }
                    default: {
                        System.out.println("numero incorrecto u operacion no encontrada");
                    }
                }

            } else {
                System.out.println("contraseña incorrecta");
                bucle = 1;
            }
        }
    }
}