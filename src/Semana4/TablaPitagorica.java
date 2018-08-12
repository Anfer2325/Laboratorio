
package Semana4;

import java.util.Scanner;
public class TablaPitagorica {
   public static void main(String[] args)
   {
    Scanner leer = new Scanner(System.in);
    int n=0;
       System.out.println("Ingrese el valor maximo: ");
       n=leer.nextInt();
       
       for(int x=1;x<=n;x++)
      
       {
           
           for (int y = 1; y <= n; y++) 
           {
               System.out.print(x*y);
               System.out.print("\t");
           }
           System.out.println("\n");
       }
   }
}
