
package EjerciciosSemana3;
import java.util.Scanner;

public class Ejercicio2 {
 
    
   public static void main(String [] args){
      
      Scanner leer = new Scanner(System.in);
      String nombre;
      double salario;
      double deduccion;
       System.out.println("Ingrese el nombre : ");
       nombre = leer.next();
       System.out.println("Ingrese el salario : ");
       salario= leer.nextDouble();
       
       if(salario>=0.01 && salario <= 152557.12){
           
           deduccion = salario * 0.00;
           System.out.println("La deduccion ISR mensual es de : "+ deduccion);
               
       }
       
       if(salario> 152557.12 && salario <= 232622.61){
       
           deduccion = salario * 0.15;
           System.out.println("La deduccion ISR mensual es de : "+deduccion);
                 
       
       }
       
       if(salario >232622.61&& salario<= 540982.82){
          deduccion =   salario * 0.20;
           System.out.println("La deduccion ISR mensual es de : "+ deduccion);
           
       
       }
       
       if(salario >540982.82){
       
       deduccion = salario *0.25;
       System.out.println("La deduccion ISR mensual es de : "+ deduccion);
       }
       
   
       
   
   
   }
}
