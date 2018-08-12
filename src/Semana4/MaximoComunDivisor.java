
package Semana4;
import java.util.Scanner;

public class MaximoComunDivisor {
    public static void main(String[]args){
        
    Scanner leer = new Scanner(System.in);
    int numero1=0;
    int numero2=0;
    int mcd=0;
    
    System.out.println("Ingrese el primer numero ");
    numero1=leer.nextInt();
    System.out.println("Ingrese el segundo numero ");
    numero2=leer.nextInt();
    
    int dividendo=Math.max(numero1, numero2);
    int divisor=Math.min(numero1,numero2);
    int residuo=0;
    
    do{
       
        
       residuo = dividendo%divisor;
       dividendo = divisor;
       divisor=residuo;
       
       
       
        
    
    
    
    
    
    }while(residuo!=0);
       
        System.out.printf("El MCD de %d y %d es %d ",numero1,numero2,dividendo);
    }
}
