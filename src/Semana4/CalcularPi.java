
package Semana4;
import java.util.Scanner;

public class CalcularPi {
    public static void main(String[]args){
        System.out.println(" C A L C U L A R  P I");
        Scanner leer=new Scanner(System.in);
        double Valorpi = 0;
        int i=1;
        int signo=1;
        System.out.println("Ingrese un valor ");
        int numeroPruebas = leer.nextInt();
        
 
         do{
             Valorpi+=signo*1.0/i;
             signo*=-1;
             i+=2;
           }while(i<numeroPruebas);
        
        Valorpi=Valorpi*4;
        System.out.printf("El numero de pi es "+Valorpi);
    }
}
