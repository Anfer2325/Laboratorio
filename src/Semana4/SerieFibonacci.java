
package Semana4;
import java.util.Scanner;
public class SerieFibonacci {
    public static void main(String[]args){
        System.out.println("S E R I E  F I B O N A C C I");
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo ");
        int numero = leer.nextInt();
        int numeroActual=3;
        int numero1=1;
        int numero2=1;
        int resultado=0;
        boolean serie1=true;
        
        do {
            if (numero<3) {
                resultado=1;
            }else{
            if (serie1==true) {
               resultado=numero1+numero2;
            numero1=resultado;
             serie1=false;
            }else{  resultado=numero1+numero2;
            numero2=resultado;
             serie1=true;}}
            numeroActual++;
        } while (numeroActual<=numero);
          System.out.println(resultado);
        
       
          
           
            
            
        
    }
    
}
