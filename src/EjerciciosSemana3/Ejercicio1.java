/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosSemana3;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String []args){
        Scanner leer = new Scanner (System.in);
        int numerosSolicitados = 0;
        double numero;
        int cantidadNumerosPares = 0 ;
        int cantidadNumerosMultiplos3 = 0 ;
        int cantidadNumerosPrimos = 0; 
        
        while(true){
            numerosSolicitados ++;
            if (numerosSolicitados <21){
                
                System.out.println("Ingrese un numero ");
                numero = leer.nextDouble();
                
                if ((numero%2)==0){
                    cantidadNumerosPares ++;
                    
                }
                
                if ((numero%3)==0){
                    cantidadNumerosMultiplos3 ++;
                }
                while (true){
                    if(numero==1){
                        cantidadNumerosPrimos++;
                    break;
                    }
                      if(numero==3){
                        cantidadNumerosPrimos++;
                    break;
                    }
                    int divisor =2;
                    double cociente=0;
                     
                    
                    
                    
                    if (numero%divisor !=0){
                       
                        cociente = numero/divisor;
                        
                    }
                    if (numero%divisor == 0){
                    break;
                    }
                    if (divisor < cociente){
                        cantidadNumerosPrimos ++;
                         break;
                    }
                    
                    divisor++;
                }
                
            
            }
            if (numerosSolicitados >20){
                System.out.println(" Numero PARES: "+ cantidadNumerosPares);
                System.out.println("Numeros Multiplo de 3 : "+ cantidadNumerosMultiplos3);
                System.out.println("Numeros Primos : "+ cantidadNumerosPrimos);
            break;
            }
            
        }
        
        
    }
}
