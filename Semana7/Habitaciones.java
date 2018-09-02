
package Semana7;
import java.util.Scanner;

public class Habitaciones {
    public static void main(String [] args){
    Scanner leer = new Scanner (System.in);
    boolean habitaciones [][] = new boolean[6][6];
    
    for (int p = 1 ; p<6;p++){
        for (int h = 0; h < 6; h++) {
             habitaciones[p][h]= false;
        }
       
    } 
    int opcion =0;
    int total=0;
    int ocupadas =0;
    boolean continuar=true;
    
        do {
            System.out.println("Menu");
            System.out.println(" 1. Reservaciones ");
            System.out.println("2.Retiros");
            System.out.println("3. Visualizar habitaciones");
            System.out.println("4. Reportes");
            System.out.println("5. Salir");
            opcion= leer.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Que tipo de habitacion desea? ");
                    System.out.println("1 Sencillas");
                    System.out.println("2 Dobles");
                    System.out.println("3 Suites");
                    opcion = leer.nextInt();
                    
                    boolean encontrado = false;
                    switch  (opcion){
                        case 1: 
                            for (int i = 1; i < 3; i++) {
                                
                                for (int j = 0; j < 6; j++) {
                                    if (habitaciones[i][j]== false) {
                                        System.out.println("Se ha procesado su reservacion");
                                        habitaciones[i][j]=true;
                                        encontrado =  true;
                                        total+=1200;
                                        ocupadas++;
                                        break;
                                    }
                                }
                                if(encontrado == true){break;}
                            }
                            if (encontrado ==false ){
                            
                                System.out.println("No se encontro habitaciones");
                            }
                            break;
                            
                        case 2: 
                            for (int i = 3; i < 5; i++) {
                                
                                for (int j = 0; j < 6; j++) {
                                    if (habitaciones[i][j]== false) {
                                        System.out.println("Se ha procesado su reservacion");
                                        habitaciones[i][j]=true;
                                        encontrado =  true;
                                       total+=3400;
                                       ocupadas++;
                                        break;
                                    }
                                }
                                if(encontrado == true){break;}
                            }
                            if (encontrado ==false ){
                            
                                System.out.println("No se encontro habitaciones");
                            }
                            
                            break;
                            
                        case 3:
                            for (int i = 5; i < 6; i++) {
                                
                                for (int j = 0; j < 6; j++) {
                                    if (habitaciones[i][j]== false) {
                                        System.out.println("Se ha procesado su reservacion");
                                        habitaciones[i][j]=true;
                                        encontrado =  true;
                                        total+=5000;
                                        ocupadas++;
                                        break;
                                    }
                                }
                                if(encontrado == true){break;}
                            }
                            if (encontrado ==false ){
                            
                                System.out.println("No se encontro habitaciones");
                            }
                            break;
                      
                    }  
                    break;
                    
                case 2:
                    int piso = 0;
                    int habi=0;
                        System.out.println("Donde se esta alojando?");
                        System.out.println("Piso");
                        piso=leer.nextInt();
                        System.out.println("Habitacion ");
                        habi=leer.nextInt();
                        if (habitaciones[piso][habi-1]==true) {
                        habitaciones[piso][habi-1]= false;
                        ocupadas--;
                    }
                        
                        
                    break;
                    
                case 3:
                    for (int i = 5; i >=0 ; i--) {
                        for (int j = 0; j < 6; j++) {
                            if (habitaciones[i][j]==false) {
                                System.out.print("["+"O"+"]");
                            }
                            if (habitaciones[i][j]==true) {
                                System.out.print("["+"X"+"]");
                            }
                            
                        }
                        System.out.println(" "); 
                    }
                    
                   break;
                 case 4:
                     int total2=0;
                            System.out.println("****REPORTES*****");
                            System.out.println("Hay "+ocupadas +" habitaciones ocupadas");
                            for (int i = 1; i < 3; i++) {
                                for (int j = 0; j < 6; j++) {
                                    if (habitaciones[i][j]==true) {
                                        total2+=1200;
                                    }
                                }
                            }
                                for (int l = 3; l < 5; l++) {
                                for (int j = 0; j < 6; j++) {
                                    if (habitaciones[l][j]==true) {
                                        total2+=3400;
                                    }
                                }
                     }
                                
                                for (int k = 5; k < 6; k++) {
                                for (int j = 0; j < 6; j++) {
                                    if (habitaciones[k][j]==true) {
                                        total2=total2+5000;
                                    }
                                }
                                }
                            
                            System.out.println("EL total en dinero es de "+ total2 +" por "+ocupadas+"  habitaciones");
                                
                            break;
                            
                 case 5:
                     continuar=false;
                     break;
               
            }
        } while (continuar ==true);
        
}
}
