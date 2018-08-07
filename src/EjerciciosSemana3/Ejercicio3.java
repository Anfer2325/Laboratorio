
package EjerciciosSemana3;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[]args){
        int numero = 0;
        
        int resultadoFactorial=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero ");
        numero = leer.nextInt();
        int numeroResultadoMultiplicacion=numero;
       
        if(numero>=1){
            switch (numero){
                case 1:
                    resultadoFactorial =1;
                break;
                
                default:{
                    while(numero>1){

                        numero--;
                        resultadoFactorial = numeroResultadoMultiplicacion * numero;
                        numeroResultadoMultiplicacion = resultadoFactorial;
                    }
                break;}
            }
            
        }
        System.out.println("El resultado factorial es : "+ resultadoFactorial);
    }
}
