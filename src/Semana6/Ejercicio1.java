
package Semana6;
import java.util.Scanner;


public class Ejercicio1 {
    public static void main (String []args){
    
    Scanner leer= new Scanner(System.in);
    int cantidadNotas=0;
    double notaMayor=0;
    double notaMenor=100;
    double total=0;
    
    while(true)
    {
        
        System.out.println("Ingrese la cantidad de notas");
        cantidadNotas=leer.nextInt();
    
        if(cantidadNotas>=10&&cantidadNotas<=20)
        {
            break;

        }else{System.out.println("Numero Invalido");}
    
    }
    double notas[]=new  double[cantidadNotas];
    
    for(int x =0;x<cantidadNotas;x++)
    {
        System.out.println("Ingrese nota para la posicion "+x);
        notas[x]=leer.nextInt();
        if(notas[x]>=0&&notas[x]<=100){
            if(notas[x]>notaMayor)
            {
                notaMayor=notas[x];
            }
            if(notas[x]<notaMenor)
            {
                notaMenor=notas[x];
            }
            total+=notas[x];
        }else
        {
            System.out.println("Nota no validad");
            notas[x]=0;
        }
    
    }
        System.out.println("La mayor nota ingresada fue "+notaMayor);
        System.out.println("La menor nota ingresada fue "+notaMenor);
        System.out.println("El promedio es de "+(total/cantidadNotas));
    }
    
    
  
    
  
    
    
    
    
}
