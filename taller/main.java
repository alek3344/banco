
package taller;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n=0;
        Banco b1 = new Banco();
        
        System.out.println("--- BANCO ---");
        System.out.println("cuantas aperturas desea (menor o igual a 10): ");
        n = entrada.nextInt();
        b1.setApertura(n);
        
    }
}
