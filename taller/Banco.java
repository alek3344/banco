
package taller;

import taller.*;
import java.util.Scanner;

public class Banco {
    Scanner entrada = new Scanner(System.in);

    public Banco() {
    }
    
    public void setApertura(int n)
    {
        int opci=0;
        boolean salir=false;
        Apertura titu = new Apertura();
        System.out.println("---APERTURA DE CUENTA---");
        titu.setApertura1(n);
        
        do
        {
            System.out.println("--- MENU ---\n");
            System.out.println("1. ver aperturas");
            System.out.println("2. retirar de alguna apertura");
            System.out.println("3. consignar a alguna apertura");
            System.out.println("4. salir");
            opci = entrada.nextInt();
            switch (opci)
            {
                case 1:
                    titu.mostrarAperturas(n);
                    break;
                case 2:
                    titu.retirar(n);
                    break;
                case 3:
                    
                    break;
                case 4:
                    salir =true;
                    break;
                    
            }
        }
        while(salir=true);
    
    }
}
