package Semana8;
import java.util.ArrayList;
import java.util.Scanner;
        

public class factura {
private String nombre_cliente;
private String fecha;
private String genero;
private int edad;
private ArrayList<producto> lista;





public factura (String _nombre_cliente,String _fecha, String _genero, int _edad){

    this.nombre_cliente = _nombre_cliente;
    this.fecha = _fecha;
    this.genero = _genero;
    this.edad = _edad;
    
   
    lista= new ArrayList<producto>();
    
}

public String getnombre (){

return this.nombre_cliente;
}

public String getfecha(){

return this.fecha;
}

public String getgenero(){
return this.genero;
}

public int getedad() {
return this.edad;

}
public void agregar_detalle(){
 
    producto nuevo_producto= new producto();
    System.out.println("Ingreso de producto");
    
    
    System.out.println("ingrese descripcion ");
    Scanner leer = new Scanner(System.in);
   
    String nombreP=leer.next();
    
    
    System.out.println("ingrese cantidad ");
    int cantidadP = leer.nextInt();
    
    System.out.println("ingrese precio ");
    float preciop = leer.nextFloat();
    System.out.println("Ingrese categoria");
    String CategoriaP=leer.next();
    
    nuevo_producto.setDescripcion(nombreP);
    nuevo_producto.setPrecio(preciop);
    nuevo_producto.setCantidad(cantidadP);
    nuevo_producto.setCategoria(CategoriaP);
    
    
    lista.add(nuevo_producto);
    
}


public float subtotal(){
float subtotal= 0 ;
    for (int i = 0; i <lista.size(); i++) {
       
           producto temp=lista.get(i);
           subtotal+=temp.obtenerTotal();
    }
    return subtotal;
}


public int obtener_total_productos(){
    int Total_productos = 0 ;
    for (int i = 0; i < lista.size(); i++) {
         producto temp=lista.get(i);
         Total_productos += temp.getCantidad();
    }
    return Total_productos;
}
public void getListaDescripcion(){
    for (int i = 0; i < lista.size(); i++) {
     producto test = lista.get(i);
    System.out.println("Descripcion producto: "+test.getDescripcion());
    System.out.println("Precio producto: "+ test.getPrecio());
        System.out.println("Cantidad de Producto: "+ test.getCantidad());
        System.out.println("Categoria de producto: "+ test.getCategoria());
        
    }

System.out.println("total pagado "+ subtotal());


}



}
