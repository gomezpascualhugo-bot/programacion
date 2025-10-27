import java.util.Scanner;

public class numeroPrimo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int z = 0;
        n = sc.nextInt();
        for(int a=2; a < n; a++){
            if(n % a == 0){
                z ++;
            } else{}
            if(z>0){
                System.out.println("compuesto");
                break;
            }else if(z==0){
                System.out.println("primo");
                break;
            }
        }
    }
}
