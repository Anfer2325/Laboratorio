
package Semana8;


public class producto {
    private String descripcion;
    private float precio;
    private int cantidad;
    private String Categoria;
    
    
    // Constructor sin parametros
    public producto(){
      descripcion = "";
      precio = 0;
      cantidad = 0;
      Categoria = "";
      
    }
    
    
    public producto(String _descripcion,float _precio,int _cantidad,String _Categoria){
    
  descripcion = _descripcion;
  precio = _precio;
  cantidad = _cantidad;
  Categoria = _Categoria;
    
    }
    
    
    
    
    
    
    
    public void setDescripcion(String _descripcion){
        this.descripcion = _descripcion;
    }
    
    
    
    public String getDescripcion(){
     return this.descripcion;
    }
    
    
    
    
    
    
    
     public void setPrecio(float _precio){
        this.precio = _precio;
    }
    
    
    
    public float getPrecio(){
     return this.precio;
    }
    
    
    
    
    
    
    
    
    
     public void setCantidad(int _cantidad){
        this.cantidad = _cantidad;
    }
    
    
    
    public int getCantidad(){
     return this.cantidad;
    }
    
    public void setCategoria(String _categoria){
    
    this.Categoria = _categoria;
    }
    
    
    public String getCategoria(){
    
    return this.Categoria;
    }
    
    
    
    
    public float obtenerTotal(){  
    return precio*cantidad;
    }
}
