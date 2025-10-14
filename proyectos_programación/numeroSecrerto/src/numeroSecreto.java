
import java.util.Scanner;

public class numeroSecreto {
    static void main(String[] args) {
        System.out.println("introduce un numero del 1 al 100, tienes como maximo 10 intentos");
        Scanner teclado = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 100 + 1);
        int numeroSeleccionado = 0;
        int rendirse = 0;
        int intentos = 0;
        while (rendirse != -1) {
            numeroSeleccionado = teclado.nextInt();
            intentos = intentos + 1;
            int intentosRestantes = 10 - intentos;
            if (numeroSeleccionado == -1 || intentos == 10) {
                rendirse = -1;
                System.out.println("te has rendidido o se han acabado tus intentos");
            } else if (numeroSecreto < numeroSeleccionado) {
                intentos = intentos + 1;
                System.out.println("es menor, si deseas rendirte ingresa -1");
                System.out.println("intentos restantes: " + intentosRestantes);
            } else if (numeroSecreto > numeroSeleccionado) {
                System.out.println("es mayor, si deseas rendirte ingresa -1");
                System.out.println("intentos restantes: " + intentosRestantes);
            } else {
                System.out.println("has acertado");
                System.out.println("lo has logrado en " + intentos + " intentos");
                rendirse = -1;
            }
        }
    }
}
