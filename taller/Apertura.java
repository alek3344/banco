
package taller;
import taller.*;
import java.util.Scanner;

public class Apertura {
    Scanner entrada = new Scanner(System.in);
    int[] n_cuenta = new int[10];
    String[] tipo = new String[10];
    int[] saldo = new int[10];
    Titular titular1;
    
    Titular titu1 = new Titular(3423212, "juan beltran", "masculino");
    Titular titu2 = new Titular(1234232, "carlos valderrama", "masculino");
    Titular titu3 = new Titular(4958362, "marcela arias", "femenino");
    Titular titu4 = new Titular(1726332, "lisa gonzales", "femenino");
    Titular titu5 = new Titular(4526121, "santiago casadiego", "masculino");
    Titular titu6 = new Titular(3362351, "luis fonseca", "masculino");
    Titular titu7 = new Titular(3483472, "lois frendly", "femenino");
    Titular titu8 = new Titular(2398123, "cameron boys", "femenino");
    Titular titu9 = new Titular(1232345, "adalberto tapias", "masculino");
    Titular titu10 = new Titular(2321333, "edy camargo", "masculino");

    public Apertura() {
    }

    public int[] getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(int[] n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public int[] getSaldo() {
        return saldo;
    }

    public void setSaldo(int[] saldo) {
        this.saldo = saldo;
    }

    public void setApertura1(int n)
    {   
        for (int i=1; i<=n; i++)
        {    
            System.out.println("");
            System.out.println("ingresa su numero de cuenta: ");
            n_cuenta[i] = entrada.nextInt();
            entrada.nextLine();
            System.out.println("ingrese el tipo de cuenta: ");
            System.out.println("- ahorro");
            System.out.println("- corriente");
            tipo[i] = entrada.nextLine();
            System.out.println("ingrese el saldo inicial:");
            saldo[i] = entrada.nextInt();
            System.out.println("");
        }    
    }

    public void retirar(int n)
    {
        int h=0;
        int retirar=0;
        System.out.println("ingrese el numero de cuenta al que desea retirar: ");
        h = entrada.nextInt();
        for (int j=1; j<=n; j++)
        {
            if (h==n_cuenta[j])
            {
               System.out.println("que cantidad desea retirar: ");
               retirar = entrada.nextInt();
               saldo[j] = saldo[j]-retirar;
            }
        }
        System.out.println("---RETIRO EXITOSO---");
    }
    
    
    public void mostrarAperturas(int n)
    {
        System.out.println("---MOSTRANDO APERTURAS---");
        System.out.println("");
        for (int i=1; i<=n; i++)
        {
            System.out.println("numero de  cuenta: " + n_cuenta[i]);
            System.out.println("tipo de  cuenta: " + tipo[i]);
            System.out.println("saldo inicial: " + saldo[i]);
            if(i==1)
            {
                System.out.println("\n--- TITULAR ---\n" + titu1);
            }
            if(i==2)
            {
                System.out.println("\n--- TITULAR ---\n" + titu2);
            }
            if(i==3)
            {
                System.out.println("\n--- TITULAR ---\n" + titu3);
            }
            if(i==4)
            {
                System.out.println("\n--- TITULAR ---\n" + titu4);
            }
            if(i==5)
            {
                System.out.println("\n--- TITULAR ---\n" + titu5);
            }
            if(i==6)
            {
                System.out.println("\n--- TITULAR ---\n" + titu6);
            }
            if(i==7)
            {
                System.out.println("\n--- TITULAR ---\n" + titu7);
            }
            if(i==8)
            {
                System.out.println("\n--- TITULAR ---\n" + titu8);
            }
            if(i==9)
            {
                System.out.println("\n--- TITULAR ---\n" + titu9);
            }
            if(i==10)
            {
                System.out.println("\n--- TITULAR ---\n" + titu10);
            }
            
            System.out.println("");
        }
    }

    
}
