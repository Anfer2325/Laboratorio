
package Semana6;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String [] args){
        Scanner leer= new Scanner(System.in);
        int arreglo[]=new int[10];
        int divisor =1;
        int divisor2=1;
        int multiplicador=10;
        int contador=0;
        int resultado=0;
       
        System.out.println("Ingre un numero entero");
        int numero = leer.nextInt();
        int residuo=numero;
       while(true)
       {
       
           if ((divisor * 10)> numero) {
               break;
           }
            divisor = divisor *multiplicador;
            contador++;
       }
                
        String posicion =""+divisor;  
        int posicionArreglo = 10-posicion.length();
              
      for(int x =0; x<10;x++)
      {
      
          arreglo[x]=-1;
      
      }
         
        for (int i = 0; i <= contador; i++) {
          
            if (posicionArreglo <10)
            {
                resultado = residuo/divisor;
                residuo= numero%divisor;
                arreglo[posicionArreglo]=resultado;
                posicionArreglo++;
            }
             divisor2=1;
             while(true)
             {
              
                if ((divisor2 * 10)>=divisor) {
                    break;
                }
                divisor2=divisor2*10;
          
            
             }
            divisor = divisor2 ;
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+arreglo[i]); 
        }
      
       
    }
}
