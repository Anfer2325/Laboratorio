/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimal_a_binario;
import java.util.Scanner;
/**
 *
 * @author Linda
 */
public class Decimal_a_Binario {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("I N I C I O  D E  P R O G R A M A");
       int numero_b10 ;
        System.out.println("ingrese un numero");
       numero_b10= leer.nextInt();
       
       if (numero_b10 > 0){
        int dividendo = numero_b10;
        int divisor = 2;
        int cociente= dividendo/divisor;
        int residuo=dividendo % divisor;
        
        String numero_b2 = "";
        
        while(cociente >=1){
        numero_b2 = residuo + numero_b2;
        dividendo= cociente;
        residuo = dividendo % divisor;
        cociente = dividendo / divisor;
        
        }
        numero_b2 = "1" + numero_b2;
           System.out.println("El numero Binario es:" + numero_b2);
       }else {
           System.out.println("Numero debe ser mayor a 0");
       }
    }
    
}
