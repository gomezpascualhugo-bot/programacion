import java.util.Scanner;

public class numeroNotasBucles {
    static void main(String[] args) {
        int numSus = 0;
        int numAprob = 0;
        int numCondi= 0;
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i<6;i++){
            double notas;
            System.out.println("introduce tu nota");
            notas = teclado.nextDouble();
                if (notas <4){
                System.out.println("eso es un suspenso");
                numSus = numSus+1;
            } else if (notas >=4 && notas ==5) {
                System.out.println("eso es un condicionado");
                numCondi = numCondi+1;
            }else{
                System.out.println("eso es un aprobado");
                numAprob = numAprob+1;
            }
        }
        System.out.println("has tenido " + numSus + " suspeno/s");
        System.out.println("has tenido " + numCondi + " condicionado/s");
        System.out.println("has tenido " + numAprob + " aprobados/s");
    }
}
