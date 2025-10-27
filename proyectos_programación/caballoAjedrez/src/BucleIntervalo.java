import java.util.Scanner;

public class BucleIntervalo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int superior;
        int inferior;
        System.out.println("escribe el limite inferior ");
        inferior = sc.nextInt();
        System.out.println("escribe el limite superior ");
        superior = sc.nextInt();

        while(inferior > superior){
            System.out.println("el numero inferior es mas alto que el superior");
            System.out.println();
            System.out.println("escribe el limite inferior ");
            inferior = sc.nextInt();
            System.out.println("escribe el limite superior ");
            superior = sc.nextInt();
        }
        
        System.out.println("escibe 0 pàra detener eñ progarmna");
        int contado=0;
        int suma=0;
        int numero;
        do{

            System.out.println("ingresa u numero");
            numero = sc.nextInt();

           if(numero>inferior && numero < superior){
               suma = numero + suma;
           } else if (numero <inferior || numero >superior && numero != 0) {
               contado++;
           }else{
               System.out.println("estas escribiendo un numero en los limiteas del intervalo");
           }

        }while(numero!=0);

        if(numero==0){
            System.out.println("esto es la sima " + suma +"y te has dejdop fuera" + contado);
        }
    }
}
