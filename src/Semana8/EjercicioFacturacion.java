
package Semana8;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioFacturacion {
      public static void main(String []args){
          ArrayList<factura> facturas = new ArrayList <factura>();
         boolean continuar=true;
         int cantidadFacturas = 0;
         Scanner leer = new Scanner(System.in);
          do{
              int opcion;
              System.out.println("*** M E N U ***");
              System.out.println("1. Agregar Factura");
              System.out.println("2.Buscar Factura");
              System.out.println("3.Reporte Factura");
              System.out.println("4. Salir");
          opcion = leer.nextInt();
          switch (opcion){
              case 1: 
                  String nombre1;
                  String fecha;
                  String genero;
                  int edad;
                          
                  System.out.println("AGREGAR FACTURA");
                  System.out.println("Ingrese Nombre ");
                  nombre1=leer.next();
                  
                  System.out.println("Ingrese fecha ");
                  fecha= leer.next();
                  System.out.println("Ingrese genero ");
                  genero=leer.next();
                  System.out.println("Ingrese edad");
                  edad=leer.nextInt();
                  
                factura nueva_factura = new factura(nombre1,fecha,genero,edad);
                
                  System.out.println("Cuantos productos desea agregar? ");
                  opcion = leer.nextInt();
                  for (int i = 0; i < opcion; i++) {
                    nueva_factura.agregar_detalle();  
                  }
      
                  System.out.println("Subtotal es  "+nueva_factura.subtotal());
                   facturas.add(nueva_factura);
   
                    cantidadFacturas++;
                  break;
                  
              case 2:
                  System.out.println("Ingrese nombre");
                  String nombre = leer.next();
                 
             for (int i = 0; i <facturas.size() ; i++) {
        factura objeto = facturas.get(i);
            if(objeto.getnombre().equals(nombre)){
                System.out.println("Detalles cliente");
                System.out.println("Nombre cliente : "+ objeto.getnombre());
                System.out.println("Genero : "+ objeto.getgenero());
                System.out.println("Fecha : "+ objeto.getfecha());
                System.out.println("Edad : "+ objeto.getedad());
                System.out.println("Detalles Factura");
                objeto.getListaDescripcion();
                break;
            }
    }
              
                  
                  break;
                  
              case 3: 
                  System.out.println("Cantidad de Facturas : "+ cantidadFacturas);
                  factura test1 ;
                  int masculino=0;
                  int femenino=0;
                  int mayoriaedad=0;
                  
                  for (int i = 0; i < facturas.size(); i++) {
                      
                    test1= facturas.get(i);
                    if(test1.getgenero().toUpperCase().equals("FEMENINO")){
                    
                    femenino++;
                    } else if(test1.getgenero().toUpperCase().equals("MASCULINO")){
                    
                    masculino++;
                    }
                    
                  }
                  System.out.println("Cantidad de facturas con genero masculino : "+ masculino);
                  System.out.println("Cantidad de facturas con genero femenino : "+ femenino);
                   for (int i = 0; i < facturas.size(); i++) {
                      
                    test1= facturas.get(i);
                    if(test1.getedad()>= 60){
                    
                    mayoriaedad++;
                    } 
                    
                  }
                  
                   System.out.println("Cantidad de facturas de la tercera edad : "+ mayoriaedad);
                  break;
                  
              case 4:
                continuar =false;
                  break;
          
          }
          
          
          }while(continuar==true);
          
        
                
      }
      
}
